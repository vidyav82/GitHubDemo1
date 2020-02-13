
public class Entry {

	public double CurrAcntAmt = 1500.00;
	public double SavAcntAmt = 1500.00;

	public void Withdrawal(double Amtwith, String WithAcnt, double CurrAcntAmt, double SavAcntAmt) {
		double Amtcharg;
		if (WithAcnt == "CA") {
			Amtcharg = Amtwith + (0.1 * Amtwith);
			this.CurrAcntAmt = CurrAcntAmt - Amtcharg;
			System.out.println("The Withdrawal amount with 10% charges is : \n" + Amtcharg);
			System.out.println("The Total CA amount after withdrawal is : \n" + this.CurrAcntAmt);
		}
		if (WithAcnt == "SA") {
			this.SavAcntAmt = SavAcntAmt - Amtwith;
			System.out.println("The Total Savings amount after withdrawal is: " + this.SavAcntAmt);
		}

	}

	public void MakePayment(double AmtPay, String WithAcnt, double CurrAcntAmt, double SavAcntAmt) {

		if (WithAcnt == "CA") {

			this.CurrAcntAmt = CurrAcntAmt - AmtPay;

			System.out.println("The Total CA amount after Payment is : \n" + this.CurrAcntAmt);
		}
		if (WithAcnt == "SA") {
			this.SavAcntAmt = SavAcntAmt - AmtPay;
			System.out.println("The Total Savings amount after Payment is: \n" +this.SavAcntAmt);
		}
	}

	public void TotalSav(double CurrAcntAmt, double SavAcntAmt) {
		// double TotalSavings = savAccntbal+currAccntbal;
		System.out.println("The Total Savings of All accounts are : \n" + (this.CurrAcntAmt+this.SavAcntAmt));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Entry Key = new Entry();

		Key.Withdrawal(15.00, "CA", Key.CurrAcntAmt, Key.SavAcntAmt);
		Key.TotalSav(Key.CurrAcntAmt, Key.SavAcntAmt);

		Key.Withdrawal(10.00, "SA", Key.CurrAcntAmt, Key.SavAcntAmt);
		Key.TotalSav(Key.CurrAcntAmt, Key.SavAcntAmt);

		Key.MakePayment(2.00, "CA", Key.CurrAcntAmt, Key.SavAcntAmt);
		Key.TotalSav(Key.CurrAcntAmt, Key.SavAcntAmt);

		Key.MakePayment(3.00, "SA", Key.CurrAcntAmt, Key.SavAcntAmt);
		Key.TotalSav(Key.CurrAcntAmt, Key.SavAcntAmt);

	}

}
