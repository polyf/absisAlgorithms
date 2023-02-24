public class Variables {

    public static String changeVariableValues(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return "a: " + a + "\n" + "b: " + b;

    }

    public static void main(String[] args) {
        System.out.println(changeVariableValues(3, 5));
    }
}
