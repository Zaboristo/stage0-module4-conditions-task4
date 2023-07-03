package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = first > second?
                first > third?
                        first:
                        third > second?
                                third:
                                second:
                second > third?
                        second:
                        third;
        System.out.println(result);
    }
}
