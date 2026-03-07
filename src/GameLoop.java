import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameLoop {
    private ArrayList<IAccount> accounts = new ArrayList<IAccount>();
    private boolean activeGameLoop = false;
    private Scanner scanner;


    public void Start() {
        activeGameLoop = true;
        scanner = new Scanner(System.in);
        while (activeGameLoop) {
            ShowMenu();
            System.out.flush();
        }
        scanner.close();

    }

    private void ShowMenu() {
        System.out.println("Input choice");
        System.out.println("1. List accounts");
        System.out.println("2. Add account");

        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        switch (choice) {
            case 1:
                ListAccounts();
                break;
            case 2:
                AddAccount();
                break;
            case 3:
                EndGame();
                break;
        }
    }

    private void AddAccount() {
        IAccount account = new DebitAccount();


        System.out.println("Input name of account");
        String accountName = scanner.nextLine();
        account.setName(accountName);
        accounts.add(account);
    }

    private void ListAccounts() {
        int choices = 0;
        for (IAccount account: accounts) {
            choices++;
            String accountName = String.format("%d. %s", choices, account.getName());
            System.out.println(accountName);
        }
        choices++;



        System.out.println("Choose account.");
        String back = String.format("%d. Back", choices);
        System.out.println(back);

        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);

    }

    private void EndGame() {
        activeGameLoop = false;
    }
}
