public class useMyInterger {

  public static void main(String[] args) {
    // creating Myinteger objects and assigning a specific value to it
    MyInteger num1 = new MyInteger(10);
    MyInteger num2 = new MyInteger(31);
    MyInteger num3 = new MyInteger(10);

    System.out.printf("Number 1 = %d isPrime: %b isOdd: %b isEven: %b\n", num1.getValue(),
        num1.isPrime(), num1.isOdd(), num1.isEven());

    System.out.printf("Number 2 = %d isPrime: %b isOdd: %b isEven: %b\n", num2.getValue(),
        num2.isPrime(), num2.isOdd(), num2.isEven());
    System.out.printf("Number 3 = %d isPrime: %b isOdd: %b isEven: %b\n", num3.getValue(),
        num3.isPrime(), num3.isOdd(), num3.isEven());

    System.out.printf("Number 1 == Number 2: %b\n", num1.equals(num2));
    System.out.printf("Number 1 == Number 3: %b\n", num1.equals(num3));
    System.out.printf("Parse int 190 string value == %d\n", MyInteger.parseInt("190"));
    System.out.printf("Parse int 200 char array value == %d\n",
        MyInteger.parseInt("200".toCharArray()));

  }
}


class MyInteger {
  // Creating an int data field named value that stores the int value represented by this object
  private int value;

  public MyInteger(int value) {
    this.value = value;
  }

  // Using the getter method to return the int Value
  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  // writing methods to determine whether or not the first integer is even, odd, or prime
  public boolean isEven() {
    return value % 2 == 0;
  }

  public boolean isOdd() {
    return !isEven();
  }

  public boolean isPrime() {
    double range = Math.sqrt(value);
    for (int i = 2; i < range; i++) {
      if (value % i == 0)
        return false;
    }
    return true;
  }

  // writing methods to calculate determine whether or not the second integer is even, odd, or prime
  public static boolean isEven(int value) {
    return value % 2 == 0;
  }

  public static boolean isOdd(int value) {
    return !isEven(value);
  }

  public static boolean isPrime(int value) {
    double range = Math.sqrt(value);

    for (int i = 2; i < range; i++) {
      if (value % i == 0)
        return false;
    }
    return true;
  }

  // writing methods to calculate determine whether or not the third integer is even, odd, or prime
  public static boolean isEven(MyInteger myInteger) {
    return myInteger.isEven();
  }

  public static boolean isOdd(MyInteger myInteger) {
    return myInteger.isOdd();
  }

  public static boolean isPrime(MyInteger myInteger) {
    return myInteger.isPrime();
  }

  // Writing a method to determine whether or not the value in this object is equal to the specified
  // value
  public boolean equals(int value) {
    return this.value == value;
  }

  public boolean equals(MyInteger myInteger) {
    return this.value == myInteger.value;
  }

  // Converting an array of numerical characters to an int value
  public static int parseInt(char[] value) {

    double valueDouble = 0;
    int toPower = value.length - 1;
    for (char aValue : value) {

      valueDouble += Math.pow(10, toPower--) * (aValue - '0');
    }

    return (int) valueDouble;
  }

  // Converting a string to an int value
  public static int parseInt(String value) {

    return MyInteger.parseInt(value.toCharArray());
  }



}
