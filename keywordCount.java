public class keywordCount {
  public static void main(String[] args) {
    int arr[][] = {{4,7,8},
                  {8,8,7}};
    int key = 8;
    int count = 0;
    for(int i =0; i<arr.length; i++){
      for(int j =0; j<arr[0].length; j++)
      if(arr[i][j] == key){
        count++;
      }
    }
    System.out.print("count of key is" +" "+ count);
  }
}
