public class Komisi extends PekerjaLepas {
    private double totalSales;    
    private double commissionRate; 

    public Komisi(String name, String address, String phone, String socialSecurityNumber, double payRate, double commissionRate) {
        super(name, address, phone, socialSecurityNumber, payRate); 
        this.commissionRate = commissionRate; 
        totalSales = 0; 
    }


    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double payment = super.pay();
        payment += totalSales * commissionRate;
        totalSales = 0; 
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString(); 
        result += "\nTotal Penjualan: " + totalSales;
        return result;
    }
}
