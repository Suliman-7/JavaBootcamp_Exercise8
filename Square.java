public class Square extends Rectangle {



    public Square () {

    }

    public Square (double side) {
    }

    public Square (double side, String color , boolean filled) {
        super(color,filled);

    }

    public double getSide () {
       return super.getLength();
    }

    public double setSide (double side) {

        return side;
    }

    public double getArea(double side) {
        return side * side ;
    }

    public double getPerimeter(double side) {
        return 4 * side ;
    }

    @Override
    public String toString() {
        return "side=" + super.getWidth() +
                ", which is a subclass of Shape" +
                "color=" + super.getColor() +
                "filled=" + super.isFilled() ;
    }
}
