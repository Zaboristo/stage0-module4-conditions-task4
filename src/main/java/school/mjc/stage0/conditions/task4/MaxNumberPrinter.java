package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if (first >= second){
            if (first >= third){
                System.out.println(first);
                return;
            }
        }
        if (second >= first){
            if (second >= third){
                System.out.println(second);
                return;
            }
        }
        if (third >= first){
            if (third >= second){
                System.out.println(third);
                return;
            }
        }
    }
}
