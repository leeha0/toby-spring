package chapter2;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/chapter2/junit-applicationContext.xml")
public class LearningTest3 {

    @Autowired
    ApplicationContext context;

    static Set<LearningTest3> learningTestObjects = new HashSet<>();
    static ApplicationContext contextObject = null;

    @Test
    public void test1() {
        assertThat(learningTestObjects, not(hasItem(this)));
        learningTestObjects.add(this);

        assertThat(contextObject == null || contextObject == this.context, is(true));
        contextObject = this.context;
    }

    @Test
    public void test2() {
        assertThat(learningTestObjects, not(hasItem(this)));
        learningTestObjects.add(this);

        assertThat(contextObject, either(is(nullValue())).or(is(this.context)));
        contextObject = this.context;
    }

    @Test
    public void test3() {
        assertThat(learningTestObjects, not(hasItem(this)));
        learningTestObjects.add(this);

        assertTrue(contextObject == null || contextObject == this.context);
        contextObject = this.context;
    }
}
