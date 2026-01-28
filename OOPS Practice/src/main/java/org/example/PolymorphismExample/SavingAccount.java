package org.example.PolymorphismExample;

public class SavingAccount extends Account {
    @Override
    void deposit() {
        System.out.println("Saving Account");
    }
}
