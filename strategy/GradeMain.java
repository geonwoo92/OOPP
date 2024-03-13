package strategy;


import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;


enum Grade {
    A(i -> i == 9 || i == 10),
    B(i -> i == 8),
    C(i -> i == 7),
    D(i -> i == 6),
    E(i -> i == 5),
    F(i -> i <= 4),
    ;
    private final Predicate<Integer> predicate;


    Grade(Predicate<Integer> predicate) {
        this.predicate = predicate;
    }

    static Grade getGrade(int t) {
        return Arrays.stream(values()).filter(i -> i.predicate.test(t)).findFirst().orElseThrow(()
                -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
    }
}

public class GradeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Grade.getGrade(sc.nextInt() / 10));
    }
}

