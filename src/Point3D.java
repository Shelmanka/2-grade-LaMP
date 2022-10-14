public class Point3D {
    private double x, y, z;

    public Point3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Point3D(double newX, double newY, double newZ) {
        x = newX;
        y = newY;
        z = newZ;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double newX) {
        x = newX;
    }

    public void setY(double newY) {
        y = newY;
    }

    public void setZ(double newZ) {
        z = newZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public static void compare(Point3D A, Point3D B) {
        if (A.getX() == B.getX() && A.getY() == B.getY() && A.getZ() == B.getZ()) {
            System.out.println("Точки равны.");
        } else {
            System.out.println("Это разные точки.");
        }
    }
}
