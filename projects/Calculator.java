// Albeit, this calculator is no where near as good as "The Simple Calculator" - now available for iOS, and MacOS (only Macs with an M1 chip). 
// Link: https://apps.apple.com/au/app/id1525169566?l=en.

public class Calculator {
    public Calculator() {
    }
  
    public double add(double first_num, double second_num) {
      return first_num + second_num;
    }
  
    public double subtract(double first_num, double second_num) {
      return first_num - second_num;
    }
  
    public double multiply(double first_num, double second_num) {
      return first_num * second_num;
    }
  
    public double divide(double first_num, double second_num) {
      return first_num / second_num;
    }
  
    public int modulo(int first_num, int second_num) {
      return first_num % second_num;
    }
  
    public static void main(String[] args) {
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.add(5.46,7.36));
      System.out.println(myCalculator.subtract(45.46,11.32));
      System.out.println(myCalculator.divide(47,8));
      System.out.println(myCalculator.multiply(35.123,5.453));
      System.out.println(myCalculator.modulo(453,9));
    }
  }