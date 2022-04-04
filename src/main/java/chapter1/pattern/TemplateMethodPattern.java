package chapter1.pattern;

public class TemplateMethodPattern {

    public abstract class Super {

        // 템플릿 메서드: 기본 알고리즘 골격
        public void templateMethod() {
            // 기본 알고리즘 코드
            hookMethod();
            abstractMethod();
        }

        // 선택적으로 오버라이드 가능한 훅 메서드
        protected void hookMethod() {
        }

        // 서브클래스에서 반드시 구현해야 하는 추상 메서드
        public abstract void abstractMethod();
    }

    // 슈퍼클래스의 메서드를 오버라이드하거나 구현하여 기능 확장
    public class Sub1 extends Super {

        @Override
        protected void hookMethod() {
            super.hookMethod();
        }

        @Override
        public void abstractMethod() {

        }
    }
}