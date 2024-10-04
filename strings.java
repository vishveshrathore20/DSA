
class strings {

    public static void main(String[] args) {

        String s2 = new String("Hello");
        String s1 = s2.intern();
        System.out.println(s1 == s2);

    }
}
