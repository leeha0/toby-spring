package chapter1.pattern;

public class SingleTonePattern {

    private static SingleTonePattern INSTANCE;

    private SingleTonePattern() {

    }

    public static synchronized SingleTonePattern getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingleTonePattern();
        }

        return INSTANCE;
    }
}
