public class SpiralMatrix {
  public static void spiralmatrix(int matrix[][]){
    int startRow = 0;
    int endRow = matrix.length-1;
    int startCol = 0;
    int endCol = matrix[0].length-1;
    while(startRow<=endRow && startCol<=endCol){
      //top
      for(int j =startCol; j<=endCol; j++){
        System.out.print(matrix[startRow][j] + " ");
      }
      //left
      for(int i =startRow+1; i<=endRow; i++){
        System.out.print(matrix[i][endCol] + " ");
      }
      //bottom
      for(int j=endCol-1; j>=startRow; j--){
        if(startRow==endRow){
          break;}
          System.out.print(matrix[endRow][j] +" ");
        
      }
      //left
      for(int i=endRow-1;i>=startRow+1; i--)  {
        if(startCol==endCol){
          break;}
          System.out.print(matrix[i][startCol] + " ");
        
      }
      startRow++;
      endRow--;
      startCol++;
      endCol--;
    }
    System.out.println();
  
}
  public static void main(String[] args) {
    int matrix[][] = {{1,2,3,4,5},
                      {5,6,7,8,4},
                      {9,10,11,12,7},
                      {13,14,15,16,8}};
    spiralmatrix(matrix);
    
  }
  
}
