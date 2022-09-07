public class TelevisionValidationTest {

  public static void main(String[] args) {
    Television tv = new Television();
    tv.setVolume(4);
    tv.setVolume(-42);
    tv.getVolume();
    tv.setBrand("hyundai");//error message
    tv.setBrand("Samsung");
    tv.setBrand("invalid");
    System.out.println(tv);

  }
}
