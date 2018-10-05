import java.util.Scanner;

public class Microphone{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    String inputString = input.nextLine();
    
    input.close();
    
    boolean found = false;

    for(int i = 1; i < inputString.length(); i++) {
      if(inputString.charAt(i - 1) == 's' &&inputString.charAt(i) == 's'){
        found = true;
        break;
      }
    }
  
    if(found) {
      System.out.println("hiss");
    } else {
      System.out.println("no hiss");
    }
  }
}
