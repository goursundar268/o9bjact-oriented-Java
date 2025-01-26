import java.util.Scanner;

class main {
    public static void main(String arr[])
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the redious of circle :");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        c.area();
        c.perimeter();
        System.out.println("enter the length of rectengle:");
        int a = sc.nextInt();
        System.out.println("enter the width of rectengle is:");
        int b = sc.nextInt();

        Rectecgle ob = new Rectecgle(a, b);
        ob.area();
        ob.perimeter();
        sc.close();
    }
}

abstract class shape {
    abstract void area();

    abstract void perimeter();
}

class Circle extends shape {
    double redius;

    Circle(double redius) {
        this.redius = redius;
    }

    void area() {

        double a = 3.14 * redius * redius;
        System.out.println("area of circle is :" + a);
    }

    void perimeter() {
        double p = 2 * 3.14 * redius;
        System.out.println(" perimiter of circle is :" + p);

    }

}

class Rectecgle extends shape {
    int length;
    int width;

    Rectecgle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        double a = length * width;
        System.out.println(" area of rectengle is:" + a);

    }

    void perimeter() {
        double p = 2 * (length + width);
        System.out.println(" perimeter of rectengle is:" + p);
    }
}