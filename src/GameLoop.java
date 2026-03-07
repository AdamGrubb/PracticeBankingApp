import java.util.List;

public class GameLoop {
    private List<IAccount> acounts;
    private

    private void AddAccount() {
        Scanner scanner = new Scanner(System.in);
        String accountName = scanner.nextLine();

        System.out.println("Input name of account");
        scanner.
    }

    private voidListAccounts() {
        for (IAccount account: acounts) {
            System.out.println(account.getName());
        }
    }
}
