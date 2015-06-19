/**
 * Created by psilva on 6/11/15.
 */
public class MainClass {

    public static void main(String[]args){
        CreditCard c1 = new CreditCard("12456789102097034","pedro");
        System.out.println(
                c1.creditCardValidation(
                        c1.getNumber()
                ));
    }


}
