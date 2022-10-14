public class Vector3D {
    private double x, y, z;

    public Vector3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Vector3D(double newX, double newY, double newZ) {
        x = newX;
        y = newY;
        z = newZ;
    }

    public Vector3D(Point3D A, Point3D B) {
        x = B.getX() - A.getX();
        y = B.getY() - A.getY();
        z = B.getZ() - A.getZ();
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

    public static double lengthOfVector(Vector3D v) {
        return Math.sqrt(v.getX() * v.getX() + v.getY() * v.getY() + v.getZ() * v.getZ());
    }

    public static void compare(Vector3D v, Vector3D u) {
        if ((v.getX() == u.getX() && v.getY() == u.getY() && v.getZ() == u.getZ()) || Vector3DProcessor.areTheVectorsCollinear(v, u)) {
            System.out.println("Векторы равны.");
        } else {
            System.out.println("Это разные векторы.");
        }
    }
}

