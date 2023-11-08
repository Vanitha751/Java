package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Songs;
import com.xworkz.shopping.things.Songs.Lyrics;

public class SongsRunner {
public static void main(String[] args) {
Songs s = new Songs ();
s.nameOfTheSong="darshana";
System.out.println("Songs class");
System.out.println("nameOfTheSong:"+s.nameOfTheSong);
Lyrics l=s.new Lyrics();
l.noOfLines=20;
l.nameOfTheSinger="sanjith";
System.out.println(l.noOfLines);
System.out.println(l.nameOfTheSinger);


}
}