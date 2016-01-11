package week5.friday.bank;

import java.io.Serializable;

import week5.friday.bank.account.BankAccount;
import week5.friday.bank.enums.InterestType;

public class Interest implements Serializable {
	private static final long serialVersionUID = 1L;
	private InterestType type;
	private double interestValue;
	private BankAccount account;

	public Interest(BankAccount account, InterestType type, double interestValue) {
		this.type = type;
		this.interestValue = interestValue;
		this.account = account;
	}

	private double calculateSimpleInterest(double forPeriod) {
		double total = account.getMoney()
				* Math.pow(1 + ((interestValue / 100) / 12), (12 * forPeriod));
		return total - account.getMoney();
	}

	private double calculateComplexInterest(double forPeriod) {
		return calculateSimpleInterest(forPeriod) / 12;
	}

	public double calculateAmount(int forPeriod) {
		if (account.getInterest().type.equals(InterestType.SIMPLE)) {
			return calculateSimpleInterest(forPeriod);
		}
		return calculateComplexInterest(forPeriod);
	}

	public InterestType getType() {
		return type;
	}

	public void setType(InterestType type) {
		this.type = type;
	}

	public double getInterestValue() {
		return interestValue;
	}

	public void setInterestValue(double interestValue) {
		this.interestValue = interestValue;
	}

	@Override
	public String toString() {
		return "Interest [type=" + type + ", interestValue=" + interestValue
				+ "]";
	}
}
