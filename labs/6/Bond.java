
public class Bond 
{
	double coupon = 1;
	double payments = 1;
	double interest = 1;
	double valueMaturity = 1;
	
	Bond()
	{
		
	}

	Bond(double coupon,double payments,double interest,double valueMaturity)
	{
		this.coupon = coupon;
		this.payments = payments;
		this.interest = interest;
		this.valueMaturity = valueMaturity;
	}
	double getPrice()
	{
		return (coupon * (1-(1/(Math.pow(1+interest,payments)))+valueMaturity * 1/Math.pow(1+interest, payments)));
	}
}

