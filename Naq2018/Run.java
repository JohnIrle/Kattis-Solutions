import java.util.Scanner;

public class Run {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String eOrD = in.next();
    String message = in.next();

    if (eOrD.equals("E")) {
	  String[] split = message.split("(?<=(.))(?!\\1)");

	  String result = "";
      for(int i = 0; i < split.length; i++) {
	    result += (split[i].charAt(0));
	    result += split[i].length();
	  }

      System.out.println(result);


	} else {
	  String[] letters = message.split("\\d");

	  String numbers = message.replaceAll(".(.)?", "$1");
      String[] numArr = numbers.split("");

      int[] intArr = new int[numArr.length];

      for(int k = 0; k < numArr.length; k++) {
        intArr[k] = Integer.parseInt(numArr[k]);
	  }


	  String result = "";
	  for(int i = 0; i < letters.length; i++) {
        for (int j = 0; j < intArr[i]; j++) {
		  result += letters[i];
		}
	  }

	  System.out.println(result);
	}

  }
}