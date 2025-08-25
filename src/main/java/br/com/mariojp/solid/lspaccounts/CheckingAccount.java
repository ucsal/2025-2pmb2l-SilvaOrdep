package br.com.mariojp.solid.lspaccounts;

public class CheckingAccount extends Account implements Withdrawable {
    @Override
    public void withdraw(double amount) {
        if(amount < 0 || balance < amount) throw new IllegalArgumentException("Valor de saque invalido ou saldo insuficiente.");
        this.balance -= amount;
    }
}