package entities;

public class BusinessAccount extends Account{
	private Double loanLimit;
	
	//Construtor Padrão
	public BusinessAccount(){
		super();
	}
	
	//Construtor com argumentos
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	//Operação de empréstimo
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
}