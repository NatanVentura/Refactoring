
public class TextStatement extends Statement {
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