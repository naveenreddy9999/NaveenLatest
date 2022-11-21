public class basicJava {
    public static void main(String[] args) {
        String ss= "123456789";

        int aa =ss.length();

        System.out.println(aa);
        System.out.println(ss.substring(aa-4));

        System.out.println(ss.toUpperCase());
        System.out.println(ss.toLowerCase());
        System.out.println(ss.substring(1,2));


        String bb="naveen";

        int kk =ss.compareTo(bb);

        System.out.println(kk);

        System.out.println(bb.charAt(2));

        System.out.println(bb.contains(ss));

        System.out.println(bb.equals(ss));

        String l = String.join("+","naveen","reddy");
        System.out.println(l);






    }
}