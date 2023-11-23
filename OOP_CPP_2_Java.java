abstract class A {
    private int a1;
    protected int a2;
    public String a3;

    A(int x, int y, String a) {
        a1 = x;
        a2 = y;
        a3 = a;
    }

    abstract int fa();

    void display() {
        System.out.println(a1 + " " + a2 + " " + a3);
    }

    int getA1() {
        return a1;
    }

    int getA2() {
        return a2;
    }
}

class B extends A {
    private double b1;
    protected int b2;

    B(int x, int y, String a, double b11, int b22) {
        super(x, y, a);
        b1 = b11;
        b2 = b22;
    }

    int fa() {
        return getA1() + a2 + (int) b1 + b2;
    }

    void display() {
        System.out.println("b1 " + b1 + " b2 " + b2);
    }

    int call_fb() {
        return fb();
    }

    private int fb() {
        return (int) (b1 + b2);
    }

    int ff() {
        return fb();
    }
}

class F extends A {
    protected float f1;

    F(float f11) {
        super(0, 0, "");  // Placeholder values, as A's constructor is not used directly
        f1 = f11;
    }

    int fa() {
        return (int) (f1 + getA1() + a2);
    }

    float getF1() {
        return f1;
    }
}

class G extends B {
    private char g;

    G(int x, int y, String a, double b11, int b22, float f11, char g1) {
        super(x, y, a, b11, b22);
        g = g1;
    }

    int ff() {
        return super.ff() + (int) g;
    }
}

class C extends B {
    private int c1;

    C(int x, int y, String a, double b11, int b22, int c11) {
        super(x, y, a, b11, b22);
        c1 = c11;
    }
}

class D extends B {
    private int d1;

    D(int x, int y, String a, double b11, int b22, int d11) {
        super(x, y, a, b11, b22);
        d1 = d11;
    }
}

class E extends C {
    private int e1;

    E(int x, int y, String a, double b11, int b22, int c11, int d11, int e11) {
        super(x, y, a, b11, b22, c11);
        e1 = e11;
    }
}

public class Main {
    static void display(A obj) {
        obj.display();
    }

    public static void main(String[] args) {
        B B1 = new B(1, 2, "a", 5.2, 2);
        C C1 = new C(1, 2, "a", 5.2, 2, 3);
        G G1 = new G(1, 2, "a", 5.2, 2, 1.9f, 'e');

        int m = G1.ff();
        System.out.println(m);

        A ptr;
        ptr = B1;

        ptr.display();
    }
}
