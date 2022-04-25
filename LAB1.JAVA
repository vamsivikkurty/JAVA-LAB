public class str_op
{
    public static void main(String args[])
    {
        String str=new String("Vikkurtyvamsi");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.indexOf("k"));
        System.out.println("Character at="+str.charAt(5));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.compareTo("Hello"));
        System.out.println(str.compareTo("VenkatAmith"));
        System.out.println(str.trim());
    }
}
