public class Vector3DProcessor {
    public static Vector3D sumOfVectors(Vector3D v, Vector3D u) {
        Vector3D result = new Vector3D();
        result.setX(v.getX() + u.getX());
        result.setY(v.getY() + u.getY());
        result.setZ(v.getZ() + u.getZ());
        return result;
    }

    public static Vector3D differenceOfVectors(Vector3D v, Vector3D u) {
        Vector3D result = new Vector3D();
        result.setX(v.getX() - u.getX());
        result.setY(v.getY() - u.getY());
        result.setZ(v.getZ() - u.getZ());
        return result;
    }

    public static double scalarProduct(Vector3D v, Vector3D u) {
        double result = v.getX() * u.getX() + v.getY() * u.getY() + v.getZ() * u.getZ();
        return result;
    }

    public static Vector3D vectorProduct(Vector3D v, Vector3D u){
        Vector3D result = new Vector3D();
        result.setX(v.getY() * u.getZ() - v.getZ() * u.getY());
        result.setY(v.getZ() * u.getX() - v.getX() * u.getZ());
        result.setZ(v.getX() * u.getY() - v.getY() * u.getX());
        return result;
    }

    public static Boolean areTheVectorsCollinear(Vector3D v, Vector3D u) {
        double a = v.getX() / u.getX();
        double b = v.getY() / u.getY();
        double c = v.getZ() / u.getZ();
        if (a == b && b == c) {
            return true;
        } else {
            return false;
        }
    }
}
