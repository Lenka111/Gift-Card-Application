//Elena Voinu
import javax.swing.JOptionPane;

import java.text.NumberFormat;

import static java.lang.Double.parseDouble;


public class TestGiftCards {

    public static void main(String[] args)
    {
        GiftCards gc = new GiftCards("", 0.0, false);

        // display opening message
        String message = "Welcome";
        JOptionPane.showMessageDialog(null, "Message: " + message,
                "Message", JOptionPane.PLAIN_MESSAGE);

        // set the gift card holder's name
        String str = JOptionPane.showInputDialog(null, "Gift card holder's name: ");
        gc.setHolder(str);



        str = JOptionPane.showInputDialog(null, "Enter card type (S or R) : ");
        // gets the String's first character
        gc.setCardType((str).charAt(0));



        // obtain the gift card number
        str = JOptionPane.showInputDialog(null, "Gift card number : ");
        gc.cardNum = Integer.parseInt(str);


        // set the gift card amount
        str = JOptionPane.showInputDialog(null, "Gift card amount: ");
        gc.setBalance(parseDouble(str));

        // issue the gift card
        gc.IssueGiftCard();

        // use the gift card
        double useCard = 0;

        str = JOptionPane.showInputDialog(null, "Amount to deduct from card: ");
        gc.setDeductAmount(parseDouble(str));



        gc.printCurrentGiftCardInfo(useCard);

        String outputMsg = "-----Summary-----";

        outputMsg += "\nGift Card Holder's Name: "+ gc.getHolder();
        outputMsg += "\nCard Type: " + gc.getCardType();
        outputMsg += "\nGift Card Number: "+ gc.cardNum;
        outputMsg += "\nGift Card Amount: "+ NumberFormat.getCurrencyInstance().format( gc.getBalance());
        outputMsg += "\nAmount to Deduct: "+ NumberFormat.getCurrencyInstance().format(gc.getDeductAmount());

        if (gc.getDeductAmount()< gc.getBalance())
        {
        outputMsg += "\nNew Card Balance: " + NumberFormat.getCurrencyInstance().format (gc.getBalance()-gc.getDeductAmount());
        JOptionPane.showMessageDialog(null, outputMsg);
        }
        else
        {
            outputMsg +="\nCould Not Deduct " + NumberFormat.getCurrencyInstance().format(gc.getDeductAmount()) +
                    "\nReason: Insufficient Balance";
            JOptionPane.showMessageDialog(null, outputMsg);
        }




    }
}
