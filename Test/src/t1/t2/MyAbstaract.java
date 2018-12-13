package t1.t2;

public class MyAbstaract extends TastAbstaract {


    protected MyAbstaract(String a) {
        super(a);
    }

    @Override
    int calculate() {
        return Integer.parseInt(getA());
    }

    public static void main(String[] args) {

        System.out.println((new MyAbstaract("12")).calculate());
    }

}
