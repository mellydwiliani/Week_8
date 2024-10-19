public class SalesPerson implements Comparable<SalesPerson> {
    private String firstName, lastName;
    private int totalSales;

    public SalesPerson(String first, String last, int sales){
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
    @Override
    public boolean equals(Object other) {
        if (other instanceof SalesPerson) {
            SalesPerson otherPerson = (SalesPerson) other;
            return lastName.equals(otherPerson.getLastName()) && firstName.equals(otherPerson.getFirstName());
        }
        return false;
    }
    @Override
    public int compareTo(SalesPerson other) {
        if (this.totalSales != other.totalSales) {
            return Integer.compare(other.totalSales, this.totalSales); 
        } else {
            return other.lastName.compareTo(this.lastName); 
        }
    }
    
    @Override
    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getTotalSales(){
        return totalSales;
    } 
}
