public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle (String namaShape, double length, double width){
        super(namaShape);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPanjang: " + length + "\nLebar: " + width;
    }    
}