import javax.swing.*;

public class TestGCard {

    public static void main(String[] args)
    {
        GCard gc = new GCard("", 0.0);
        // display opening message
        String message = "welcome";
        JOptionPane.showMessageDialog(null, "Message: " + message,
                "Message", JOptionPane.PLAIN_MESSAGE);
        // set the gift card holder's name
        String str =
                JOptionPane.showInputDialog(null, "gift card holder's name : ");
        gc.setHolder(str);
        // obtain the gift card number
        str = JOptionPane.showInputDialog(null, "gift card number : ");
        gc.cardNum = Integer.parseInt(str);
        // Set gift card type
        str =
                JOptionPane.showInputDialog(null, "Enter card type (refund, purchase) : ");
        gc.setCardType(str);
        // set the gift card amount
        str = JOptionPane.showInputDialog(null, "gift card amount : ");
        gc.setBalance(Double.parseDouble(str));

        // issue the gift card
        gc.IssueGiftCard();
        // use the gift card
        double useCard = 0;
        str =
                JOptionPane.showInputDialog(null, "deduct amount from card : ");
        useCard = Double.parseDouble(str);
        // print current card balance
        gc.printCurrentGiftCardInfo(useCard);
    }
}
