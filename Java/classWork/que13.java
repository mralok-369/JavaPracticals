package com.company.classWork;
import java.util.Scanner;

class BankDetails {
    public String accno;
    private String name;
    private String acc_type;
    private long balance;
    Scanner sc = new Scanner(System.in);

    //method to open new account
    public void openAccount() {
        System.out.print("Enter Account No: ");
        accno = sc.next();
        System.out.print("Enter Account type: ");
        acc_type = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }

    //method to display account details
    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accno);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);
    }

    //method to deposit money
    public void deposit() {
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextLong();
        balance = balance + amt;
        System.out.println("Amount deposited successfully.");
    }

    //method to withdraw money
    public void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
        }
    }

    //method to search an account number
    public boolean search(String ac_no) {
        if (accno.equals(ac_no)) {
            showAccount();
            return (true);
        }
        return (false);
    }

    public void fundTransfer(BankDetails tbank) {
        long amt;
        System.out.println("Enter the amount you want to transfer: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            tbank.balance+=amt;
            System.out.println("Balance after transfer: " + balance);
        }
        else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
        }
    }
}
public class que13 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        //create initial accounts
        System.out.println("How many number of customers do you want to input? ");
        int n = sc.nextInt();
        BankDetails[] C = new BankDetails[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new BankDetails();
            C[i].openAccount();
        }
        // loop runs until number 6 is not pressed to exit
        int ch;
        do {
            System.out.println("\n -----Banking System Application-----");
            System.out.println(" 1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5. Fund transfer to other Account \n 6.Exit ");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        System.out.println("for account " + (i + 1));
                        C[i].showAccount();
                    }
                    break;

                case 2:
                    System.out.print("Enter account no. you want to search: ");
                    String ac_no = sc.next();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account no. : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account No : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;

                case 5:
                    BankDetails b1 = new BankDetails();
                    BankDetails b2 = new BankDetails();

                    System.out.println("Enter Account number for 1st account : ");
                    String ac1 = sc.next();

                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac1);
                        if (found) {
                            System.out.println("account no "+ac1+" found!!!");
                            b1=C[i];
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }


                    System.out.println("Enter Account for transfer fund : ");
                    String ac2 = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac2);
                        if (found) {
                            System.out.println("account no. "+ac2+" found...");
                            b2=C[i];
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    b1.fundTransfer(b2);
                    break;
                case 6:
                    System.out.println("See you soon...");
                    break;
            }
        }
        while (ch != 6);
    }
}

/*
package com.company.classwork;
import java.util.Scanner;

class BankDetails {
    public String accno;
    private String name;
    private String acc_type;
    private long balance;
    Scanner sc = new Scanner(System.in);

    //method to open new account
    public void openAccount() {
        System.out.print("Enter Account No: ");
        accno = sc.next();
        System.out.print("Enter Account type: ");
        acc_type = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }

    //method to display account details
    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accno);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);
    }

    //method to deposit money
    public void deposit() {
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextLong();
        balance = balance + amt;
        System.out.println("Amount deposited successfully.");
    }

    //method to withdraw money
    public void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
        }
    }

    //method to search an account number
    public boolean search(String ac_no) {
        if (accno.equals(ac_no)) {
            showAccount();
            return (true);
        }
        return (false);
    }

    public void fundTransfer(String ac) {
        long amt;
        System.out.println("Enter the amount you want to transfer: ");
        amt = sc.nextLong();
        System.out.println("Enter account number to transfer : ");
        String tac = sc.next();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after transfer: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
        }
    }
}
public class que13 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        //create initial accounts
        System.out.println("How many number of customers do you want to input? ");
        int n = sc.nextInt();
        BankDetails[] C = new BankDetails[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new BankDetails();
            C[i].openAccount();
        }
        // loop runs until number 5 is not pressed to exit
        int ch;
        do {
            System.out.println("\n -----Banking System Application-----");
            System.out.println(" 1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5. Fund transfer to other Account \n 6.Exit ");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter account no. you want to search: ");
                    String ac_no = sc.next();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account no. : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 5:
                    BankDetails b1 = new BankDetails();
                    BankDetails b2 = new BankDetails();
                    System.out.println("Enter Account number : ");
                    String ac1 = sc.next();
                    for (int i = 0; i < C.length; i++) {
                        if (C[i].accno == ac1){
                            b1 = C[i];
                        }
                        else {
                            System.out.println("Search failed! Account doesn't exist..!!");
                        }
                    }
                    System.out.println("Enter Account for transfer fund : ");
                    String ac2 = sc.next();
                    for (int i = 0; i < C.length; i++) {
                        if (C[i].accno == ac2){
                            b2 = C[i];
                        }
                        else {
                            System.out.println("Search failed! Account doesn't exist..!!");
                        }
                    }
                    b1.fundTransfer(ac1);
                    b2.fundTransfer(ac2);
                    break;
                case 6:
                    System.out.println("See you soon...");
                    break;
            }
        }
        while (ch != 6);
    }
}
*/
