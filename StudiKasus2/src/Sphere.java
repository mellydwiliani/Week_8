public class Sphere extends Shape{
    private double radius;

    public Sphere (String namaShape, double radius){
        super(namaShape);
        this.radius = radius;
    }
    
    public double area(){
        return 4*Math.PI*radius*radius;
    }

    public String toString(){
        return super.toString() + " of radius " + radius;
    }
}
