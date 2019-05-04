
 abstract class Appliance 
{
	double voltage;
	String Color;
	String madeIn;
	double price;
	
	Appliance()
	{
		
	}
	
	Appliance(double voltage, String Color, String madeIn, double price)
	{
		this.voltage = voltage;
		this.Color = Color;
		this.madeIn = madeIn;
		this.price = price;
	}

	public double getVoltage() {
		return voltage;
	}

	

	public String getColor() {
		return Color;
	}

	

	public String getMadeIn() {
		return madeIn;
	}



	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public int compareTo (Appliance arg0)
	{
		if (this.getPrice() < arg0.getPrice())
		{
			return-1;
		}
		else if ( this.getPrice() > arg0.getPrice())
		{
			return 0;
		}
		else
		{
			return 0;
		}
	}
	public String toString()
	{
		return "";
	}
	
	
}

class Toaster extends Appliance
{
	private String model;
	private int maxTemp;
	private int maxCountdown;
	
	Toaster() 
	{
		
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}

	public void setMaxCountdown(int maxCountdown) {
		this.maxCountdown = maxCountdown;
	}

	Toaster(double voltage, String Color, String madeIn, double price) 
	{
		super(voltage, Color, madeIn, price);
		this.voltage = voltage;
		this.Color = Color;
		this.madeIn = madeIn;
		this.price = price;
	}
	 
	
}

class TV extends Appliance
{
	TV(double voltage, String Color, String madeIn, double price) 
	{
		super(voltage, Color, madeIn, price);
		this.price = price;
		this.screenSize = screenSize;
		this.brand = brand;
		this.colorRange = colorRange;
	}
	TV()
	{
		
	}

	private String screenSize;
	private String brand;
	private String colorRange;
	

	public String getScreenSize() {
		return screenSize;
	}

	public String getBrand() {
		return brand;
	}

	public String getColorRange() {
		return colorRange;
	}
	

	
}
	


class Telephone extends Appliance
{
	private String brand;
	private int model;
	private int type;
	
	Telephone() 
	{
		
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public void setType(int type) {
		this.type = type;
	}

	Telephone(double voltage, String Color, String madeIn, double price) {
		super(voltage, Color, madeIn, price);
		// TODO Auto-generated constructor stub
		this.voltage = voltage;
		this.Color = Color;
		this.madeIn = madeIn;
		this.price = price;
		
	
	}
}
