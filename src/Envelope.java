public class Envelope {

	
	Envelope() {
		super();
	}
	


	Envelope(int dollars, int quarters, int dimes, int nickels, int pennies) {
		super();
		this.dollars = dollars;
		this.quarters = quarters;
		this.dimes = dimes;
		this.nickels = nickels;
		this.pennies = pennies;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


private int dollars, quarters, dimes, nickels, pennies;


public int getDollars() {
	return dollars;
}


public void setDollars(int dollars) {
	this.dollars = dollars;
}


public int getQuarters() {
	return quarters;
}


public void setQuarters(int quarters) {
	this.quarters = quarters;
}


public int getDimes() {
	return dimes;
}


public void setDimes(int dimes) {
	this.dimes = dimes;
}


public int getNickels() {
	return nickels;
}


public void setNickels(int nickels) {
	this.nickels = nickels;
}


public int getPennies() {
	return pennies;
}


public void setPennies(int pennies) {
	this.pennies = pennies;
}


public int getTotalCents(){
	return 0;
//	return dollars + quarters + dimes + nickels + pennies;
}

}

