public class Transpose {
  public static void printMatrix(int arr[][]){
    for(int i =0; i<arr.length; i++ ){
      for(int j =0; j<arr[0].length; j++){
        System.out.print(arr[i][j] + " ");
      }
    
    System.out.println();
  }
}
public static void main(String[] args) {
  int row =2, column =3;
  int matrix[][] ={{1,2,3},{5,6,7}};
  printMatrix(matrix);
  //Transposing
  int t[][] = new int[column][row];
  for(int i =0; i<row; i++){
    for(int j = 0; j<column; j++){
      t[j][i]=matrix[i][j];
    }
  }
 
  printMatrix(t);
}


}