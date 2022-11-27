
public class HtmlStatement extends Statement {
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