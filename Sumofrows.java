public class Sumofrows {
  public static void main(String[] args) {
    int sum = 0;
    int arr[][] ={{1,4,9},{1,1,2},{2,2,3}};
    for(int j = 0; j<arr[0].length; j++){
      sum+=arr[1][j];
    }
    System.out.println("Sum of the second row elements are"+" " + sum);
    
  }
}
