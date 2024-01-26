import java.util.*;

public class TransposeMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int arr[][] = new int [n][m];
    int t[][] = new int [m][n];
    //input from the user
    for(int i = 0; i<n; i++){
      for(int j = 0; j<m; j++){
        arr[i][j] =sc.nextInt();
      }
    }
    //transposing taking place
    for(int i =0; i<n; i++){
      for(int j =0; j<m; j++){
        t[j][i]=arr[i][j];
        
      }
    }
    // printing te transposed matrix
    for(int i = 0; i<m; i++){
      for(int j = 0; j<n; j++){
        System.out.print(arr[j][i] + " ");
      }
      System.out.println();
    }
    
  }
}