package t1.t2;

public interface TestB {
    default void showMyName2() {
        System.out.println(TestB.class.getCanonicalName());
    }
}
