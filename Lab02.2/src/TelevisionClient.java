import java.sql.SQLOutput;

public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.setBrand("Sony") ;
    tv1.setVolume(25);
    tv1.turnOn();
    tv1.turnOff();

    Television tv2 = new Television();
    tv2.setBrand("Logitech");
    tv2.setVolume(50);
    tv2.turnOn();
    tv2.turnOff();


    System.out.println(tv1.toString());
    System.out.println(tv1);
  }


}
