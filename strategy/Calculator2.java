package strategy;

import java.util.Scanner;

enum Operator2 {
    PLUS {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },
    MINUS {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public int apply(int a, int b) {
            return a / b;
        }
    };

    public abstract int apply(int a, int b);
}

public class Calculator2 {
    public static int calculate(int a, int b, Operator2 operator) {
        return operator.apply(a, b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수, 정수, 연산자");
        System.out.println(Calculator2.calculate(sc.nextInt(),
                sc.nextInt(),
                Operator2.valueOf(sc.next())));


    }


}
