public class reverse {
  public static void main(String[] args) {
    int arr [] = {1,3,4,7};
    int j = arr.length;
    // while(j>0){
    //   System.out.println(arr[j-1]);
    //   j--;
    // }

    for (int i = j; i>0; i--) {
        System.out.println(arr[i-1]);
    }
  }
}
