package chapter2;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class LearningTest1 {

    static LearningTest1 learningTestObject;

    @Test
    public void test1() {
        assertThat(this, is(not(sameInstance(learningTestObject))));
        learningTestObject = this;
    }

    @Test
    public void test2() {
        assertThat(this, is(not(sameInstance(learningTestObject))));
        learningTestObject = this;
    }

    @Test
    public void test3() {
        assertThat(this, is(not(sameInstance(learningTestObject))));
        learningTestObject = this;
    }
}
