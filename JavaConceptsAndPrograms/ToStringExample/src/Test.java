
public class Test {

    public static void main(String[] args)
    {
        long now = System.currentTimeMillis();
        usePlus();
        System.out.println("Time for + : " + (System.currentTimeMillis() - now) + " ms");

        now = System.currentTimeMillis();
        useAppend();
        System.out.println("Time for append() : " + (System.currentTimeMillis() - now) + " ms");
    }

    private static void usePlus()
    {

        for(int i=0;i<100000;i++)
            s+="*";
    }


    private static void useAppend()
    {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<100000;i++)
            s.append("*");
    }


}
