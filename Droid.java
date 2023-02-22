// define a class
public class Droid {

    // states
    String name;
    int batteryLevel;
  
    // create a constructor method
    public Droid(String droidName) {
      name = droidName;
      batteryLevel = 100;
    } 
  
    // define a toString method
    public String toString(){
      return "Hello, I'm the droid: " + name;
    }
  
    // define a new method
    public void performTask(String task) {
      System.out.println(name + " is performing task: " + task);
      batteryLevel = batteryLevel - 10;
    }
  
    // define energy report method
    public void energyReport() {
      System.out.println("The battery status is: " + batteryLevel);
    }
  
    // include main method
    public static void main(String[] args) {
      Droid Codey = new Droid("Codey");
      Codey.performTask("Breakdancing");
      Codey.energyReport();
    }
  }