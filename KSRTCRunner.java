package driver;

import com.xworkz.september.things.KSRTC;

public class KSRTCRunner {
public static void main(String[] args) {
	KSRTC ksrtcbus=new KSRTC();
	ksrtcbus.getBusName("Rajahamsa");
	ksrtcbus.getBusName();
	String name=ksrtcbus.getBusName();
	System.out.println(name);
	ksrtcbus.getBusNumber("KA8002");
	ksrtcbus.getBusNumber();
	String number=ksrtcbus.getBusNumber();
	System.out.println(number);
	ksrtcbus.getNoOfSeats(30);
	ksrtcbus.getNoOfSeats();
	int seats=ksrtcbus.getNoOfSeats();
	System.out.println(seats);
	ksrtcbus.getTo("Bangloor");
	ksrtcbus.getTo();
	String to=ksrtcbus.getTo();
	System.out.println(to);
	ksrtcbus.getFrom("Tirupathi");
	ksrtcbus.getFrom();
	String from=ksrtcbus.getFrom();
	System.out.println(from);
	
}
}
