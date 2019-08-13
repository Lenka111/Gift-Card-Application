//Elena Voinu
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GiftCards {

    static NumberFormat nf = NumberFormat.getCurrencyInstance();
    Date myDate = new Date();
    Calendar cal = Calendar.getInstance();
    String myDateFormat = "MM/dd/yyyy";
    SimpleDateFormat dtToday = new SimpleDateFormat(myDateFormat);


    // define the class data members
    public boolean expires;
    private double balance;
    public int cardNum;
    private double deductAmount;
    private char cardType;
    public String issueDate;
    private String holder;

    // define the member methods
    // default constructor
    public GiftCards() {}

    // overloaded constructor
    public GiftCards(String n, double amt,boolean exp)
    {
        holder = n;
        balance = amt;
        expires = exp;
    }


    public void IssueGiftCard()
    {
        System.out.println("");
        System.out.println(" [ Card Issued ]");
        System.out.println(" Today's Date is: " + dtToday.format(myDate));
        System.out.println(" Card Holder . . . " + holder);
        System.out.println(" Card number . . . " + cardNum);
        System.out.println(" Card Type . . . " + cardType);
        System.out.println(" Card Amount . . . " +
                nf.getCurrencyInstance().format(balance));

        //gift card expires in 3 years
        cal.add(Calendar.YEAR, 3);
        System.out.println(" Expiration Date: ---- " + cal.getTime());
    }

    public double getBalance()
    {
        return balance;
    }

    public void setDeductAmount(double v){ deductAmount = v; }

    public double getDeductAmount() {return deductAmount;}

    void setBalance(double b)
    {
        balance = b;
    }

    public String getHolder() { return holder; }

    public void setHolder(String h)
    {
        holder = h;
    }

    public void setCardType(char t)
    {
        cardType = t;
    }
    public char getCardType() {return cardType;}


    public void printCurrentGiftCardInfo(double spend)
    {
        System.out.println("");
        System.out.println(" [ Card Balance ]");
        System.out.println(" Today's Date is: " + dtToday.format(myDate));
        System.out.println(" Card Amount . . . " +
                nf.getCurrencyInstance().format(balance));
        if (balance >= deductAmount) {
            System.out.println(" Deducted  . . . . " +
                    nf.getCurrencyInstance().format(deductAmount));
            spend = balance - deductAmount;

            System.out.println(" Remaining Balance . . . " +
                    nf.getCurrencyInstance().format(spend));
        }
        else {

            System.out.println(" Amount to deduct  . . . . " +
                    nf.getCurrencyInstance().format(deductAmount));
            System.out.println(" Could Not Deduct " +
                    nf.getCurrencyInstance().format(deductAmount)+
                    "\nReason: ... Insufficient balance");

        }
        

    }
}


