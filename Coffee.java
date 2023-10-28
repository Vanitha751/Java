package driver;

public class Coffee {
private String branchName;
private String flavours;
private int price;
private String place;
private String quantity;
public Coffee() {
	System.out.println("this is default constructor");
}
public Coffee(String branchName,String flavours,int price,String place,String quantity) {
	this.branchName=branchName;
	this.flavours=flavours;
	this.price=price;
	this.place=place;
	this.quantity=quantity;
}

public void BranchName(String branchName) {
	this.branchName = branchName;
}
public void flavours(String flavours) {
	this.flavours=flavours;
}
public void price(int price) {
	this.price=price;
}
public void place(String place) {
	this.place=place;
}
public void quantity(String quantity) {
	this.quantity= quantity;
}
public String getBranchName() {
	return branchName;
}
public String getFlavours() {
	return flavours;
}
public int getPrice() {
	return price;
}
public String getPlace() {
	return place;
}
public String getQuantity() {
	return quantity;
}

}