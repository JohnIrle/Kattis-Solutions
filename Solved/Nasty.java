import java.util.Scanner;

public class Nasty {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    int[][] cases = new int[n][3];

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < 3; j++) {
        cases[i][j] = in.nextInt();
      }
    }

    for(int[] e : cases) {
      if(e[1] - e[2] > e[0]) {
        System.out.println("advertise");
      } else if (e[1] - e[2] ==  e[0]) {
        System.out.println("does not matter");
      } else {
        System.out.println("do not advertise");
      }
    }
  }
}