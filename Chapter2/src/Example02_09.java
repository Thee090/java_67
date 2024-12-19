public class Example02_09 {

    public static void main(String[] args) {
        final double PI = 3.1416;
        double width = 22.0, height = 12.0, redius = 16.0, result;
        char type;
        String message;

        type = '2';
        result = (type == '1') ? (width * height) : (PI * redius * redius);
        message = (type == '1') ? "Reactangle" : "Circle";

        System.out.println(("Calculate Area " + message + " = " + result));
    }
}