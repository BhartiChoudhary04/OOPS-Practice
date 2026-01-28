package org.example.PolymorphismExample;

//Run time Polymorphism
public class Main {
    static void main() {
        Account account = new currentAccount();
        account.deposit();

        Account account1 = new SavingAccount();
        account1.deposit();
    }
}
