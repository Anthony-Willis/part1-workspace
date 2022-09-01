public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.brand = "Sony";
    tv1.volume = 25;
    tv1.turnOn();
    tv1.turnOff();

    Television tv2 = new Television();
    tv2.brand = "Logitech";
    tv2.volume = 50;
    tv2.turnOn();
    tv2.turnOff();
  }


}
