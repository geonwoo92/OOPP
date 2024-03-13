package strategy;

import model.Account;
import view.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

import static java.time.chrono.JapaneseEra.values;

public class Enum {


    Scanner sc = new Scanner(System.in);
    AUTH("A", (sc) -> AuthView.main(sc)),
    GRADE("G", (sc) -> GradeView.main(sc)),
    BOARD("B", (sc) -> {}),
    KAUP("K", (sc) -> KaupView.main(sc)),
    USER("U", (sc) -> UserView.main(sc)),
    ACCOUNT("AC", (sc) -> AccountView.main(sc)),
    EXIT("0", (sc) -> {

    });

    private final Function<String, String> function;

    public Enum(Function<String, String> function) {
        this.function = function;
    }

    static Enum GetView(String s) {
        return Arrays.stream(values()).filter(i -> i.function.test(s))
                .findFirst().orElseThrow(()->
                        new IllegalArgumentException("올바른 연산자가 아닙니다."));

    }
}

