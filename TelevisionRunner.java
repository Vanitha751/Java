package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Television;

public class TelevisionRunner {
public static void main(String[] args) {
 Television t = new Television ();
 t.getInformation();
 t.nameOfTheCompany="Sony";
 System.out.println(t.nameOfTheCompany);

}
}
