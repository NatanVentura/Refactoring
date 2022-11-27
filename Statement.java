import java.util.Enumeration;
public class Statement {
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
         return "";
     }
     public String chargeStr(double total){
         return "";
     }
     public String frequentStr(int frequent){
         return "";
     }
}