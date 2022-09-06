import java.sql.SQLOutput;

public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.setBrand("Sony");
    tv1.setVolume(25);
    tv1.turnOn();
    tv1.turnOff();

    System.out.printf("%d Television instances created%n", Television.getInstanceCount());

    Television tv2 = new Television("Sony", 50);
    tv2.setBrand("Logitech");
    tv2.setVolume(72);
    tv2.turnOn();
    tv2.turnOff();

    System.out.printf("%d Television instances created%n", Television.getInstanceCount());

    Television tv3 = new Television("LG");

    System.out.printf("%d Television instances created%n", Television.getInstanceCount());

    System.out.println(tv1.toString());//same output as line below
    System.out.println(tv1);
    System.out.println(tv2);
    System.out.println(tv3);

  }


}
