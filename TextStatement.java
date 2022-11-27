import java.util.Enumeration;

public class TextStatement extends Statement {
     public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = nameStr(aCustomer.getName());
        while (rentals.hasMoreElements()) {
           Rental each = (Rental) rentals.nextElement();
           //show figures for each rental
           result += each.getMovie().getTitle()+ ": " +
           String.valueOf(each.getCharge()) + "<BR>\n";
        }
        //add footer lines
        result += chargeStr(aCustomer.getTotalCharge());
        result += frequentStr(aCustomer.getTotalFrequentRenterPoints());
        return result;
     }
     public String nameStr(String name){
        return "Rental Record for " + name + "\n";
     }
     public String chargeStr(double total){
        return "Amount owed is " + String.valueOf(total) + "\n";
     }
     public String frequentStr(int frequent){
        return "You earned " + String.valueOf(frequent) + " frequent renter points";
     }
}