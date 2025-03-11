public class RowColumnSum2DArray {
  public static void main(String[] args) {

    int[][] array = {
       {1, 2, 3},
       {4, 5, 6},
       {7, 8, 9}
    };
    
    // Row-wise sum
    System.out.println("Row-wise Sum:");
    for (int i = 0; i < array.length; i++) {
      int rowSum = 0;
      for (int j = 0; j < array[i].length; j++) {
        rowSum += array[i][j];
      }
      System.out.println("Row " + (i + 1) + " Sum: " + rowSum);
    }
    
    // Column-wise sum
    System.out.println("\nColumn-wise Sum:");
    for (int j = 0; j < array[0].length; j++){

      int colSum = 0;
      for (int i = 0; i < array.length; i++) {
        colSum += array[i][j];
      }
      System.out.println("Column " + (j + 1) + " Sum: " + colSum);
    }
  }
}

    
