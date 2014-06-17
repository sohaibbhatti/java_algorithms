// Sohaib Talaat Bhatti -- sohaibbbhatti@gmail.com
//
// Identifies the Unique combination of 3 numbers in a set of numbers n
// that has a sum equal to 0
//
// java 10 20 -30  -> 1
public class ThreeSum {
  public static int count(int[] input) {

    int count = 0;

    int inputSize = input.length;


    for (int i = 0; i < inputSize; i++) {
      for (int j = i + 1; j < inputSize; j++) {
        for (int k = j + 1; k < inputSize; k++) {
          if (input[i] + input[j] + input[k] == 0)
            count++;
        }
      }

    }

    return count;

  }


  public static void main(String[] args){
    int[] argsInteger = new int[args.length];

    for (int i = 0 ; i < args.length; i++) {
      argsInteger[i] = Integer.parseInt(args[i]);
    }
    // Should be a better way how to do the above



    System.out.println(count(argsInteger));
  }
}
