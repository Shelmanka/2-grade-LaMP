import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        testForPoint();
        //testForVector();
    }

    public static void testForPoint(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координату x точки A: ");
        double x = in.nextDouble();
        System.out.println("Введите координату y точки A: ");
        double y = in.nextDouble();
        System.out.println("Введите координату y точки A: ");
        double z = in.nextDouble();
        Point3D A = new Point3D();
        A.setX(x);
        A.setY(y);
        A.setZ(z);

        System.out.println("Введите координату x точки B: ");
        x = in.nextDouble();
        System.out.println("Введите координату y точки B: ");
        y = in.nextDouble();
        System.out.println("Введите координату y точки B: ");
        z = in.nextDouble();
        Point3D B = new Point3D(x, y, z);

        System.out.println("Введите координату x точки C: ");
        x = in.nextDouble();
        System.out.println("Введите координату y точки C: ");
        y = in.nextDouble();
        System.out.println("Введите координату y точки C: ");
        z = in.nextDouble();
        Point3D C = new Point3D(x, y, z);

        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());

        Point3D.compare(A, B);
        Point3D.compare(C, C);
    }

    public static void testForVector(){
        Scanner in = new Scanner(System.in);
        Vector3D v = new Vector3D();
        Vector3D u = new Vector3D();
        Vector3D w = new Vector3D();

        System.out.println("Введите координату x первого вектора:");
        double x = in.nextDouble();
        System.out.println("Введите координату y первого вектора:");
        double y = in.nextDouble();
        System.out.println("Введите координату z первого вектора:");
        double z = in.nextDouble();
        v.setX(x);
        v.setY(y);
        v.setZ(z);

        System.out.println("Введите координату x второго вектора:");
        x = in.nextDouble();
        System.out.println("Введите координату y второго вектора:");
        y = in.nextDouble();
        System.out.println("Введите координату z второго вектора:");
        z = in.nextDouble();
        u.setX(x);
        u.setY(y);
        u.setZ(z);

        System.out.println("Введите координату x третьего вектора:");
        x = in.nextDouble();
        System.out.println("Введите координату y третьего вектора:");
        y = in.nextDouble();
        System.out.println("Введите координату z третьего вектора:");
        z = in.nextDouble();
        w.setX(x);
        w.setY(y);
        w.setZ(z);
    }
}