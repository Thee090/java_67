public class Example02_10 {
    final double PI = 3.1416;
    String message;
    double area;

    public Example02_10(double redius) {
        message = "Circle";
        area = PI * redius * redius;
    }

    public Example02_10(double width, double height) {
        message = "Rectangle";
        area = width * height;

    }
    public static void main(String[] args) {
        Example02_10 circle = new Example02_10(10.0);
        System.out.print("Calculate Area " + circle.message);
        System.out.println(" = " + circle.area);

        Example02_10 ractangle = new Example02_10(12.0, 20.0);
        System.out.print("Calculate Atea " + ractangle.message);
        System.out.println(" = " + ractangle.area);
    }
}
