package strategy;

import java.util.Scanner;
enum Weekend{

    MONDAY{
        @Override
        public String toKorean() {
            return "월요일";
        }
    },TUESDAY{
        @Override
        public String toKorean() {
            return "화요일";
        }
    }, WEDNESDAY{
        @Override
        public String toKorean() {
            return "수요일";
        }
    },THURSDAY{
        @Override
        public String toKorean() {
            return "목요일";
        }
    },FRIDAY{
        @Override
        public String toKorean() {
            return "금요일";
        }
    },SATURDAY{
        @Override
        public String toKorean() {
            return "토요일";
        }
    },SUNDAY{
        @Override
        public String toKorean() {
            return "일요일";
        }
    };

    public abstract String toKorean();
}
public class Week2 {

    public static String week2(Weekend weekend){
        return weekend.toKorean();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("무슨 요일");
        System.out.println(Week2.week2(Weekend.valueOf(sc.next())));


    }
}
