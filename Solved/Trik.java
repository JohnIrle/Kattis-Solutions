import java.util.Scanner;

public class Trik {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String pattern = input.nextLine();
    input.close();

    int a, b, c, t;
    a = 1; b = 0; c = 0; t = 0;
    for(int i = 0; i < pattern.length(); i++) {
      if(pattern.charAt(i) == 'A') {
        t = a;
        a = b;
        b = t;
      } else if(pattern.charAt(i) == 'B') {
        t = b;
        b = c;
        c = t;
      } else if(pattern.charAt(i) == 'C') {
        t = a;
        a = c;
        c = t;
      }
    }

    if(a == 1) {
      System.out.println(1);
    };
    if(b == 1) {
      System.out.println(2);
    }
    if(c == 1) {
      System.out.println(3);
    }
  }
}