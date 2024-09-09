public class fibonacci {
  public static void main(String[] args) {
    int first = 0;
    int Second = 1;
    int Third ;
    int finale = 10;
    System.out.print(first + " " + Second +" ");
    for (int i = 2; i<finale;i++){
        Third = first+Second;
        System.out.print(Third + " ");
        first = Second;
        Second = Third;
    }
  }
}
