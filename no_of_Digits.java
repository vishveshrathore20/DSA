public class no_of_Digits {
  public static void main(String[] args) {
    int val =1122;
    int count=0;
    
    while(val!=0){
      int digit = val % 10;
      count++;
      val/=10;
    }
    System.out.println(count);
  }
}
