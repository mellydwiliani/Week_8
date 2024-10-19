public abstract class Shape{
    protected String namaShape;

    public Shape(String namaShape){
        this.namaShape = namaShape;
    }

    public abstract double area();

    @Override
    public String toString() {
        return namaShape;
    }
}