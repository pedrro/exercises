import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by psilva on 6/11/15.
 */
public class CreditCard {

    private String number, name;

    public CreditCard(String number, String name){
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String creditCardValidation(String number){
        Pattern p = Pattern.compile("[^0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(number);
        boolean b = m.find();
        if(number.length() < 14 || number.length() > 18 || b) {
            return"Invalid number, your credit card number must have between 14 and 18 characters, without letters or special characters";
        }else{
            return "Valid credit card number";
        }
    }
}
