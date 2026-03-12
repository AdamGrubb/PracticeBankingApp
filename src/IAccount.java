public interface IAccount {
    public int Id = 0;
    public String AccountName = "";
    public int Balance = 0;

    public String getName ();
    public void setName (String name);
    public void depositMoney (int amount);
    public int withdrawMoney(int amount);
}

