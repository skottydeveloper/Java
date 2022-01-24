public class Droid {
    int batteryLevel;
    String name;
  
    public Droid(String droidName) {
      name = droidName;
      batteryLevel = 100;
    }
  
    public void performTask(String task) {
      System.out.println("Codey is performing task: " + task + ".");
      batteryLevel -= 10;
      energyReport();
    }
  
    public void energyReport() {
      System.out.println("Battery level of droid: " + batteryLevel + "%\n");
    }
  
    public String toString() {
      return "Hello, I'm the droid: " + name + ".";
    }
  
    public void energyTransfer(Droid anotherDroid, int energyAmount) {
      if (energyAmount <= batteryLevel / 2) {
        batteryLevel -= energyAmount;
        anotherDroid.batteryLevel += energyAmount;
        System.out.println("Energy transfer complete!\n");
        energyReport();
        anotherDroid.energyReport();
      } else {
        System.out.println(name + "'s battery level is too low! Try transferring smaller amount of energy.\n");
      }
    }
  
    public static void main(String[] args) {
      Droid android1 = new Droid("Codey");
      System.out.println(android1.toString());
      android1.performTask("dancing");
  
      Droid android2 = new Droid("Droidy");
      System.out.println(android2.toString());
      android2.performTask("cleaning");
  
      android1.energyTransfer(android2, 10);
    }
}