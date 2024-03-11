package strategy;


import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;


enum Grade {
    A(9, () -> "A"),
    B(8, () -> "B"),
    C(7, () -> "C"),
    D(6, () -> "D"),
    E(5, () -> "E"),
    F(4, () -> "F"),
    ;

    private final int score;
    private final Supplier<String> supplier;



    Grade(int score, Supplier<String> supplier) {
        this.score = score;
        this.supplier = supplier;
    }

    public static String getGrade(int score) {
        return getOperator(score/10).supplier.get() + "";
    }

    public static Grade getOperator(int score) {
        return Arrays.stream(values())
                .filter(grade -> score >= grade.)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("유효하지 않은 점수입니다."));
    }
}

public class GradeMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Score");
        System.out.println(Grade.getOperator(sc.nextInt()));

    }
}

