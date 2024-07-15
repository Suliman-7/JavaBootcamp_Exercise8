
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape Sh1 = new Shape();

        Shape Sh2 = new Shape("Blue",false);

        System.out.println(Sh1.toString());
        System.out.println(Sh2.toString());
        System.out.println(Sh1.isFilled());
        Sh2.setFilled(true);
        System.out.println(Sh1.getColor());
        Sh2.setColor("Black");
        System.out.println(Sh2.toString());

        System.out.println("----------------------------------");



        Circle C1 = new Circle(4,"red",true);
        Circle C2 = new Circle(6);
        Circle C3 = new Circle();


        System.out.println(C1.toString());
        System.out.println("Area : " + C1.getArea());
        System.out.println("Perimeter: " + C1.getPerimeter());

        System.out.println(C2.toString());
        System.out.println("Area : " + C2.getArea());
        System.out.println("Perimeter : " + C2.getPerimeter());

        System.out.println(C3.toString());
        System.out.println("Area : " + C3.getArea());
        System.out.println("Perimeter : " + C3.getPerimeter());


        System.out.println("----------------------------------");


        Rectangle R1 = new Rectangle(10,6,"red",true);
        Rectangle R2 = new Rectangle(5,5);
        Rectangle R3 = new Rectangle();

        System.out.println(R1.toString());
        System.out.println(R2.getColor());
        System.out.println(R3.isFilled());
        R1.setColor("White");
        R2.setLength(7);
        R3.setFilled(true);
        System.out.println(R1.getWidth());
        System.out.println(R3.getLength());
        System.out.println("Area : " + R1.getArea());
        System.out.println("Perimeter : " + R1.getPerimeter());

        System.out.println("----------------------------------");



        Square Sq1 = new Square(4,"Yellow",false);
        Square Sq2 = new Square(8,"Blue",true);
        Square Sq3 = new Square();
        System.out.println(Sq1.toString());
        System.out.println(Sq1.setSide(6));
        System.out.println(Sq2.getSide());
        System.out.println("Area : " + Sq2.getArea());
        System.out.println("Perimeter : " + Sq3.getPerimeter());
        System.out.println(Sq3.toString());



        System.out.println("----------------------------------");














    }
}