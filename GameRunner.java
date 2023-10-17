package driver;
import com.xworkz.september.things.*;
public class GameRunner {
public static void main(String args[]) {
Game gameName=new Game();
gameName.onSave("CandyCrush");
gameName.onSave("SubaySurf");
gameName.onSave("Ludo");
gameName.onSave("TempleRun");
gameName.update("Ludo","TempleRun9898");
gameName.getElements();
System.out.println("delete........");
gameName.delete("TempleRun9898");
gameName.getElements();
}
}
