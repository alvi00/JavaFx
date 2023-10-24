package application;

public class Car implements Vehicle {
	protected String brandName;
	protected String carName;
	protected String carColor;
	protected String carmodelname;
	protected double carPrice;

	public Car() {
		this.brandName = "Not initialized yet";
		this.carName = "Not initialized yet";
		this.carColor = "Not initialized yet";
		this.carPrice = 0.0;
		this.carmodelname="Not initialized yet";
	}
	
	@Override
	public void setCarmodelname(String carmodelname) {
		this.carmodelname = carmodelname;
	}

	@Override
	public String getCarmodelname() {
		return carmodelname;
	}

	@Override
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String getBrandName() {
		return brandName;
	}

	@Override
	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public String getCarName() {
		return carName;
	}

	@Override
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	@Override
	public String getCarColor() {
		return carColor;
	}

	@Override
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public double getCarPrice() {
		return carPrice;
	}

	@Override
	public String toString() {
		return "The brand of the car is " + brandName + "\n\nThe car name is " + carName +" "+carmodelname
				+ "\n\nThe color of the car is " + carColor + "\n\nThe price of the car is " + carPrice;
	}
}