public class B {

    private Integer i1;

    private int i2;

    private double d;

    private Float f;

    public B(int a, int b, int c, int d) {
        this.i1 = a;
        this.i2 = b;
        this.d = d;
        this.f = (float)c;
    }

    public B(Integer a, int b, double c, Float d) {
        this.i1 = a;
        this.i2 = b;
        this.d = c;
        this.f = d;
    }

    public int f(Float x, int y) {
        return 11;
    }

    public int f(double x, int y) {
        return 12;
    }

    public Integer f(double x, Long y) {
        return 13; 
    }

    public double g(long x) {
        return 7.0;
    }

    public Float g(Integer x) {
        return 8f;
    }

    public static void main(String[] args) {
        B b1 = new B(1,2,3,4);
        System.out.println(b1.d);
        System.out.println(b1.f(5,6));
        System.out.println(b1.f(7f,8));
        System.out.println(b1.f(10f,17L));
        B b2 = new B(b1.i1, 5, 6, 9);
        System.out.println(b2.f);
        System.out.println(b2.f(b1.f,b1.i2));
        B b3 = new B(b2.i1, 14, 15, 16f);
        System.out.println(b3.d);
        System.out.println(b3.g(new Long(18)));
        System.out.println(b3.g(b1.i1));
        System.out.println(b3.f(b2.g(19), 21));
    }

}
