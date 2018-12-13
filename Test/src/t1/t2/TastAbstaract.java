package t1.t2;

public abstract class TastAbstaract {

    private final String a;


    protected TastAbstaract(String a) {
        this.a = a;
    }

    abstract int calculate();

    public String getA() {
        return a;
    }
}
