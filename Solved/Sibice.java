import java.util.Scanner;

public class Sibice {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int w = in.nextInt();
    int h = in.nextInt();

    int[] matches = new int[n];

    int i = 0;

    while(i < n) {
      matches[i] = in.nextInt();
      i++;
    }

    double hypot = Math.sqrt(Math.pow(w,2) + Math.pow(h,2));

    for(int e : matches){
      if(e <= hypot) {
        System.out.println("DA");
      } else {
        System.out.println("NE");
      }
    }

  }

}