package driver;

public class CoffeeRunner {
	public static void main(String[] args) {
	Coffee coffeeName= new Coffee();
	coffeeName.BranchName("Tea stall");
	coffeeName.getBranchName();
	String name=coffeeName.getBranchName();
	System.out.println(name);
	coffeeName.flavours("ginger");
	coffeeName.getFlavours();
	String flavour=coffeeName.getFlavours();
	System.out.println(flavour);
	coffeeName.price(20);
	coffeeName.getPrice();
	int price=coffeeName.getPrice();
	System.out.println(price);
	coffeeName.place("Tirupathi");
	coffeeName.getPlace();
	String place=coffeeName.getPlace();
	System.out.println(place);
	coffeeName.quantity("2cups");
	coffeeName.getQuantity();
	String quantity=coffeeName.getQuantity();
	System.out.println(quantity);
	}
	
	
}
