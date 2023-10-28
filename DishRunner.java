package driver;

import com.xworkz.september.things.Dish;

public class DishRunner {
	public static void main(String args[]) {
		Dish dishName=new Dish();
		dishName.getPropertyName("Biriyani");
		dishName.getPropertytype("non-veg");
		dishName.getPropertyPrice(200);
		dishName.getPropertyQuantity("1kg");
		dishName.getPropertyPlace("Tirupathi");
		dishName.getName();
		String name=dishName.getName();
		System.out.println(name);
		dishName.getType();
		String type=dishName.getType();
		System.out.println(type);
		dishName.getPrice();
		int Price=dishName.getPrice();
		System.out.println(Price);
		dishName.getQuantity();
		String quantity=dishName.getQuantity();
		System.out.println(quantity);
		dishName.getPlace();
		String place=dishName.getPlace();
		System.out.println(place);
}

}
