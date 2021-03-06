package week5.friday.bank.account;

import java.io.FileNotFoundException;

import javax.naming.InvalidNameException;

import week5.friday.bank.ScannerClass;
import week5.friday.bank.enums.AccountAccessCommands;
import week5.friday.bank.exception.AgeException;
import week5.friday.bank.interfaces.AccountSetupOperations;
import week5.friday.bank.storage.Bank;
import week5.friday.bank.util.MessageConstants;

public class AccountAccessManager implements AccountSetupOperations {
	private ScannerClass sc;

	public AccountAccessManager() {
		sc = new ScannerClass();
		try {
			Bank.loadAccounts();
			Bank.loadLastAccountID();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean createAccount() throws AgeException, InvalidNameException {
		return new AccountCreater().createAccount();
	}

	@Override
	public BankAccount login() throws IllegalAccessException {
		return new Login().login();
	}

	public BankAccount createAccountOrLogin() throws InvalidNameException,
			AgeException, IllegalAccessException {
		System.out.println(MessageConstants.START_PAGE_NAVIGATION);
		int commandNumber = sc.getInt();

		AccountAccessCommands command = AccountAccessCommands.values()[commandNumber - 1];
		switch (command) {
		case CREATE_ACCOUNT:
			createAccount();
			Bank.saveAccounts();
		case LOGIN:
			return login();
		default:
			break;
		}

		return null;
	}
}
