public class Triangle {

    /**
     * @author polyf
     * @param a represents the "a" triangles side
     * @param b represents the "b" triangles side
     * @param c represents the "c" triangles side
     * @throws IllegalArgumentException Is throw when one of the parameters are less than zero or negatives.
     */

    public static boolean isTriangle(int a, int b, int c) {
        if (a<=0 || b<=0 || c<=0) {
            throw new IllegalArgumentException("The sides values must be bigger than zero");
        }
        return a <= b + c && b <= a + c && c <= a + b;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(3, 4, 5));
        System.out.println(isTriangle(3, 4, 15));
    }
}
