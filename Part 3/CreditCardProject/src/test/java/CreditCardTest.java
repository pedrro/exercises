import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    @Test
    public void testCreditNumberWithSpecialCharacter() {
        CreditCard creditCard = new CreditCard("@1234567891234", "pedro");
        assertEquals("Invalid number, your credit card number must have between 14 and 18 characters, without letters or special characters",
                creditCard.creditCardValidation(creditCard.getNumber()));
    }

    @Test
    public void testCreditNumberWithLetter() {
        CreditCard creditCard = new CreditCard("A1234567891234", "pedro");
        assertEquals("Invalid number, your credit card number must have between 14 and 18 characters, without letters or special characters",
                creditCard.creditCardValidation(creditCard.getNumber()));
    }

    @Test
    public void testCreditNumberWithLessThan14Characters() {
        CreditCard creditCard = new CreditCard("1234567891", "pedro");
        assertEquals("Invalid number, your credit card number must have between 14 and 18 characters, without letters or special characters",
                creditCard.creditCardValidation(creditCard.getNumber()));
    }

    @Test
    public void testCreditNumberWithMoreThan18Characters() {
        CreditCard creditCard = new CreditCard("12345678912343456789", "pedro");
        assertEquals("Invalid number, your credit card number must have between 14 and 18 characters, without letters or special characters",
                creditCard.creditCardValidation(creditCard.getNumber()));
    }

    @Test
    public void testCreditNumberWithRightFormat() {
        CreditCard creditCard = new CreditCard("12456789102097034", "pedro");
        assertEquals("Valid credit card number",
                creditCard.creditCardValidation(creditCard.getNumber()));
    }
}