public class armStorng {
  public static void main(String[] args) {
   
    int originalnumber =153;
    int n = originalnumber;
    int totallength = String.valueOf(n).length();
    int sum = 0;
    int digit;
    
    while(n!=0){
      digit = n % 10;
      sum += Math.pow(digit, totallength);
      n = n/10;
    }
    
    if(sum==originalnumber){
      System.out.println("given number is Arm strong");

    }
    else{
      System.out.println("given is not a armstrong");
    }

    
  }
}
