package com.xworkz.september.things;

public class Dish {
	private String dishName;
	private String type;
	private int price;
		private String quantity;
		private String place;
	
		public void getPropertyName(String dishName) {
			this.dishName=dishName;
		}
		public void getPropertytype(String type) {
			this.type=type;
		}
		public void getPropertyPrice(int price) {
			this.price=price;
		}
		public void getPropertyQuantity(String quantity) {
			this.quantity=quantity;
		}
		public void getPropertyPlace(String place ) {
			this.place=place;
		}
       public String getName() {
    	   return this.dishName;
       }
       public String getType() {
    	   return this.type;
       }
     public int getPrice() {
    	 return this.price;
     }
     public String getQuantity() {
    	 return this.quantity;
     }
    public String getPlace() {
    	return this.place;
    }
}
