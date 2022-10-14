public class Vector3DArray {
    int n; //длина массива

    public Vector3DArray() {
        Vector3D[] vectorArray = new Vector3D[n];
    }

    public void setN(int newN) {
        n = newN;
    }

    public void changeElement(int i, Vector3D v, Vector3D[] vectorArray) {
        vectorArray[i] = v;
    }

    public static double maxLength(Vector3D[] vectorArray) {
        double result = 0;
        for (Vector3D v : vectorArray) {
            if (Vector3D.lengthOfVector(v) > result) {
                result = Vector3D.lengthOfVector(v);
            }
        }
        return result;
    }

    public static int findVector(Vector3D[] vectorArray, Vector3D v) {
        int result = -1;
        for (int i = 0; i < vectorArray.length; i++) {
            if (vectorArray[i] == v) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            return -1;
        } else {
            return result;
        }
    }

    public static Vector3D sumAllVectors(Vector3D[] vectorArray) {
        Vector3D result = new Vector3D();
        for (Vector3D v : vectorArray) {
            result = Vector3DProcessor.sumOfVectors(result, v);
        }
        return result;
    }

    public static Vector3D linearCombination(double[] coefficients, Vector3D[] vectorArray) {
        Vector3D result = new Vector3D();
        if (coefficients.length != vectorArray.length) {
            result.setX(0);
            result.setY(0);
            result.setZ(0);
        } else {
            for (int i = 0; i < coefficients.length; i++) {
                vectorArray[i].setX(vectorArray[i].getX() * coefficients[i]);
                vectorArray[i].setY(vectorArray[i].getY() * coefficients[i]);
                vectorArray[i].setZ(vectorArray[i].getZ() * coefficients[i]);
                result = Vector3DProcessor.sumOfVectors(vectorArray[i], result);
            }
        }
        return result;
    }

    public static Point3D[] pointShift(Point3D P, Vector3D[] vectorArray) {
        Point3D[] result = new Point3D[vectorArray.length];
        Point3D temp = new Point3D();
        for (int i = 0; i < vectorArray.length; i++){
            temp.setX(P.getX() + vectorArray[i].getX());
            temp.setY(P.getY() + vectorArray[i].getY());
            temp.setZ(P.getZ() + vectorArray[i].getZ());
            result[i] = temp;
        }
        return result;
    }
}
