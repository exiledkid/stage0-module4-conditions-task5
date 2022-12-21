package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {

        boolean a, b, c, d;
        a = (year % 4 == 0);
        b = (year % 100 != 0);
        c = (year % 400 == 0);
        d = a & (b || c);
        year = d ? 1 : 0;

        switch (year) {
            case (1):
                System.out.println("leap");
                break;

            case (0):
                System.out.println("not leap");
                break;
        }
    }
}
