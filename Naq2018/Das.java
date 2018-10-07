import java.util.Scanner;
import java.util.Arrays;
public class Das {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int p = in.nextInt();
    int q = in.nextInt();
    int s = in.nextInt();

    int[] pArr = new int[s + 1];
    int[] qArr = new int[s + 1];

    for(int k = 1; k < s + 1; k++) {

	  if(k % p == 0) {
  		pArr[k] = 1;
      }

	  if(k % q == 0) {
	   qArr[k] = 1;
	  }
	}

    int result = 0;
    for(int i = 0; i < s + 1; i++) {
      if(pArr[i] == 1 && qArr[i] == 1) {
	    result += 1;
	  }
	}

	if(result > 0) {
	  System.out.println("yes");
	} else {
	  System.out.println("no");

	}

  }
}