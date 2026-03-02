public class printascar {
    public static void main(String[] args) {
        aski(" ","abc");

    }
    static void aski(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        aski(p+ch,up.substring(1));
        aski(p,up.substring(1));
        aski(p+(ch+0),up.substring(1));
    }
}
