package br.com.mariojp.solid.lspaccounts;

public class BankService {
    public void processWithdrawal(Account acc, double amount){
    	if (acc instanceof CheckingAccount) acc.withdraw(amount);
    }
}