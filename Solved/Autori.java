import java.util.Scanner;
import java.util.Arrays;
public class Autori {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String in = input.nextLine();

    String[] split = in.split("-");

    String output = "";
    for(int i = 0; i < split.length; i++) {
      output += split[i].charAt(0);
    }

    System.out.println(output);
    
    
  }
}