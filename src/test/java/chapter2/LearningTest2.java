package chapter2;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class LearningTest2 {

    static Set<LearningTest2> learningTestObjects;

    @Test
    public void test1() {
        assertThat(learningTestObjects, not(hasItem(this)));
        learningTestObjects.add(this);
    }

    @Test
    public void test2() {
        assertThat(learningTestObjects, not(hasItem(this)));
        learningTestObjects.add(this);
    }

    @Test
    public void test3() {
        assertThat(learningTestObjects, not(hasItem(this)));
        learningTestObjects.add(this);
    }
}
