package t1.t2;

public interface TestA {

    default void showMyName() {
        System.out.println(TestA.class.getCanonicalName());
    }
}
