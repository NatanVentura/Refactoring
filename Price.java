public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
           result += (daysRented - 3) * 1.5;
        return result;
     }
 }