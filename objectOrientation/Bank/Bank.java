package objectOrientation.Bank;
/**
 *
 */

public class Bank {

    public String number;
    protected String type;
    private String owner;
    private Boolean status;
    private Float balance;


    private void showOpenError(String type, Float balance){
        String accountString = new String();
        Float openValue = 0f;

        if(type.equals("C")) {
            accountString = new String("CHECKING ACCOUNT");
            openValue = 150f;
        }
        if(type.equals("S")) {
            accountString = new String("SAVING ACCOUNT");
            openValue = 50f;
        }
        System.out.printf("You can not open an %s with $%.2f. You need at least $%.2f", accountString, balance, openValue);
    }

    public boolean open(String name, String type, Float balance){
        System.out.println("Openning account");
        if((type.equals("C") && balance < 150) || (type.equals("S") && balance < 50)){
            this.showOpenError(type, balance);
            return false;
        }
        this.owner = name;
        this.setBalance(type, balance);
        this.setStatus(true);
        this.number = "ABC123C";
        return true;
    }

    private void setStatus(boolean status){
        this.status = status;
    }
    private boolean isOpened(){
        return this.status;
    }
    public float getBalance(){
        return this.balance;
    }

    private void setBalance(String type, Float balance){
        if(this.isOpened() == false){
            if(type == "N") this.balance = 0f;
            if(type == "C") this.balance = balance - 150;
            if(type == "S") this.balance = balance - 50;
        }
    }

    public Bank(){
        this.setStatus(false);
        this.setBalance("N", 0f);
    }

    
    
}
