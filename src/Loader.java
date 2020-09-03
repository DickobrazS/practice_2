public class Loader {
    public static void main(String[] arg)
    {
        ball1 a=new ball1();
        a.color="Blue";
        a.radius=5.4f;
        a.type = "Football";

        ball1 b =new ball1();
        b.color="Red";
        b.radius =2.4f;
        b.type="Baseball";

        System.out.println(b);
        System.out.println();
        System.out.println(a);


    }
}
