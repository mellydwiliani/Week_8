import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        final double coverage = 350;
        Paint paint = new Paint(coverage);

        Shape deck = new Rectangle("Persegi Panjang", 20, 35);
        Shape bigBall = new Sphere("Lingkaran", 15);
        Shape tank = new Cylinder("Tabung", 10, 30);

        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck: " + fmt.format(deckAmt));
        System.out.println("Big Ball: " + fmt.format(ballAmt));
        System.out.println("Tank: " + fmt.format(tankAmt));
    }
}
