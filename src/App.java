
public class App {

  public static void main(String[] args) {
  
      Logger loggerA = new AsteriskLogger(); 
      Logger loggerB = new 
      
      loggerA.log("Hello");
      loggerA.error("Hello");
      loggerB.log("Hello");
      loggerB.error("ERROR");
      
  }

}
