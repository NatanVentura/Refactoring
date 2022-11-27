import java.util.Enumeration;
public class HtmlStatement extends Statement {
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
        return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
     }
     public String chargeStr(double total){
        return "<P>You owe <EM>" + String.valueOf(total) + "</EM><P>\n";
     }
     public String frequentStr(int frequent){
        return "On this rental you earned <EM>" +  String.valueOf(frequent) + "</EM> frequent renter points<P>";
     }
}