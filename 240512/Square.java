public class Square {
    private double side;
    public Square(double side){
        this.side = side;
    }

//    public double getSide(){
//        return side;
//    }

    public void calculateArea(){
        double area = side * side;
        System.out.println("The area of the square is: " + area);
    }

    public static void main(String[] args) {
        Square square1 = new Square(5);
        square1.calculateArea();
    }
}
