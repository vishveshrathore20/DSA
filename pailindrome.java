public class pailindrome {
  public static void main(String[] args) {
    int n = 1211;
    int x =n;
    int sum=0;
    while(n!=0){
      int digit = n%10;
      sum = sum *10+digit;
      n/=10;
    }

    if(sum==x){
      System.out.println("pallindrome");
    }
    else{
      System.out.println("not");
    }
  }
}
