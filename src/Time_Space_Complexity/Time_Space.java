package Time_Space_Complexity;

public class Time_Space {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        System.out.println(start);
        for(int i=0;i<=1000000;i++)
        {
            //System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end);
        System.out.println(start-end);
    }
}
