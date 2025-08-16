package Day6_assignment;

enum Day {Monday, Saturday}

public class TestEnum{
    public static void main(String[] args) {
         Day today=Day.Saturday;
         Day todaym=Day.Monday;
         System.out.println("Today is="+today);
         System.out.println("Day after tommorow is ="+todaym);
    }
}