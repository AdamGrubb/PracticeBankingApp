public class DebitAccount implements IAccount {

    private String name;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void depositMoney(int amount) {
    }

    public int withdrawMoney(int amount) {
        int withdrawAmount;
        if (balance > amount) {
            balance -= amount;
            withdrawAmount = amount;
        }
        else {
            withdrawAmount = 0;
        }

        return withdrawAmount;
    }
}
