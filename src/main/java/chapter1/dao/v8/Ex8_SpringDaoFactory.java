package chapter1.dao.v8;

import chapter1.connection.ConnectionMaker;
import chapter1.connection.DConnectionMaker;
import chapter1.dao.v6.Ex6_RefactoringInterfaceUserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 애플리케이션 컨텍스트 또는 빈 팩토리가 사용할 설정정보 표시
@Configuration
public class Ex8_SpringDaoFactory {

    // 오브젝트 생성을 담당하는 IoC용 메서드라는 표시
    @Bean
    public Ex6_RefactoringInterfaceUserDao userDao() {
        return new Ex6_RefactoringInterfaceUserDao(connectionMaker());
    }

    @Bean
    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
