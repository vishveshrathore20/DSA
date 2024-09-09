public class bufferbuilder {
    public static void main(String[] args) {
        StringBuffer objStringBuilder =new StringBuffer();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                objStringBuilder.append("A");
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                objStringBuilder.append("B");
            }
        });

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
;        }
        catch(Exception e){

        }
        System.out.println(objStringBuilder.toString());
     }
}
