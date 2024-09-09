public class Prime_Number{
    public static void main(String[] args) {
        int count =0;
        int n=9;

        for(int i=2;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>1){
            System.out.println("Not as prime number");
        }
        else{
            System.out.println("prime number");
        }
    }
}
