public class Loader {
    public static void main(String[] arg)
    {
        ball1 a=new ball1();
        a.setColor("Blue");
        a.setRadius(5.4f);
        a.setType("Football");

        ball1 b =new ball1();
        b.setColor("Red");
        b.setRadius(2.4f);
        b.setType("Baseball");

        System.out.println(b);
        System.out.println();
        System.out.println(a);


    }
}
