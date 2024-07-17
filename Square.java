public class Square extends Rectangle {



    public Square () {

    }

    public Square (double side) {
        super.setLength(side);
    }

    public Square (double side, String color , boolean filled) {
        super(side,side,color,filled);




    }

    public double getSide () {

        return super.getLength();
    }

    public double setSide (double side) {

        return side;
    }

    public double getArea() {

        return super.getLength() * super.getWidth() ;
    }

    public double getPerimeter() {

        return 4 * super.getWidth() ;
    }

    @Override
    public String toString() {
        return "width=" + super.getWidth() +
                "length=" + super.getLength() +
                ", which is a subclass of Shape" +
                "color=" + super.getColor() +
                "filled=" + super.isFilled() ;
    }
}
