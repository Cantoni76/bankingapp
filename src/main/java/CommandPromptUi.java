import model.Account;
import model.Transaction;
import model.User;
import service.AccountService;
import service.LoginService;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Scanner;

public class CommandPromptUi {

    private static LoginService loginService = new LoginService();
    private static AccountService accountService = new AccountService();

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Id: ");
        int userId = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Password: ");
        String password = sc.nextLine();

        User user = new User(userId, password);

       boolean isUserValid = loginService.authenticateUser(user);

       if(!isUserValid) {
           System.out.println("Invalid User details.... Good by!..");
           return;
       }

        System.out.println("Select one of the following options:");

        System.out.println("1. Send Money");
        System.out.println("2. Check Balance");
        System.out.println("1. View Transaction History");

        int option = sc.nextInt();
        sc.nextLine();

        switch (option) {
            case 1:
                System.out.println("Enter recipient account number");
                String recAcctNo = sc.nextLine();
                System.out.println("Enter amount");
                BigDecimal amount = sc.nextBigDecimal();

               Account senderAcct = accountService.getAccountByUserId(userId);
               Account recvAcct = accountService.getAccountByAccountNumber(recAcctNo);

                Transaction transaction = new Transaction();


                break;
            case 2:
                System.out.println("not yet implemented");
                break;
            case 3:
                System.out.println("not yet implemented");
                break;
                default:
                    System.out.println("Invalid Option. Good By!");
        }
    }
}
