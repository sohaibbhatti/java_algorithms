// Sohaib Talaat Bhatti -- sohaibbbhatti@gmail.com
//

public class BinarySearch {
  public static int binarySearch(int[] a, int key) {
    int start = 0;
    int end = a.length - 1;

    while (start <= end) {
      int middle = start + (end - start) / 2;

      if (a[middle] == key) {
        return key;
      }
      else if (a[middle] > key) {
        end = middle - 1;
      }
      else if (a[middle] < key) {
        start = middle + 1;
      }
    }

    return -1;
  }


  public static void main(String[] args) {
    int[] input = {6,13,14,25,33,43,51,53,64,72,85,93,95,96,97};

    System.out.println(binarySearch(input, Integer.parseInt(args[0])));
  }
}

