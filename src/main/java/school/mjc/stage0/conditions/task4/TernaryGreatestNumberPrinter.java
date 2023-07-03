package school.mjc.stage0.conditions.task4;

import org.w3c.dom.ls.LSOutput;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
       int result = first > second ?
               first:
              second;
        System.out.println(result);
    }
}
