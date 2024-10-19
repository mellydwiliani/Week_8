public class Cylinder extends Shape{
    private double radius;
    private double height;

    public Cylinder (String namaShape, double radius, double height){
        super(namaShape);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius: " + radius + "\nTinggi: " + height;
    }
}
