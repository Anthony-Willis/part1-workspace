class Television {
  public static final int MIN_VOLUME = 0; //static final fields. CONSTANTS
  public static final int MAX_VOLUME = 100;

  private static int instanceCount = 0;
  private String brand;
  private int volume;


  public Television() { //constructor. same name, no return type
    instanceCount++;
  }

  public Television(String brand) {
    this();
    setBrand(brand);

  }

  public Television(String brand, int volume) {
    this(brand);
    setVolume(volume);

  }

  public void turnOn() {
    boolean isConnected = verifyInternetConnection();
    System.out.println("The " + brand + " television is on, with a volume of " + volume);

  }

  public void turnOff() {
    System.out.println("The " + brand + " television is on off ");
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    if(brand.equals("Samsung") || brand.equals("LG") || brand.equals("Sony")) {
      this.brand = brand;
    }else {
      System.out.printf("%s is not a valid brand, only accepts Samsung, LG, or Sony televisions.%n");
    }

  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if(volume < MIN_VOLUME || volume > MAX_VOLUME){
      System.out.printf("%d is invalid; volume must be between %d and %d (inclusive).%n", volume, MIN_VOLUME, MAX_VOLUME);

    }else {
      this.volume = volume;
    }
  }

  private boolean verifyInternetConnection() {
    return true;
  }

  public String toString() {
    return "Television: brand " + brand + ", volume = " + volume;
  }


}
