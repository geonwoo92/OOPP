package view;

import model.Member;
import model.Subject;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(Scanner sc) {

        System.out.printf("평균 점수를 구하시오 %n");

        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();

        Member student = Member.builder()
                .build();
        Subject subjects = Subject.builder()
                .english(util.createRandomInteger(0, 100))
                .korean(util.createRandomInteger(0, 100))
                .math(util.createRandomInteger(0, 100))
                .build();

        int total = grade.getSum(subjects);
        double average = (int)grade.getAvg(total);

        System.out.printf("==========성적표 =========== \n" +
                        "이름 : %s \n" +
                        "국어 : %s \n" +
                        "영어 : %s \n" +
                        "수학 : %s \n " +
                        "총점 : %s\n " +
                        "평균 : %s",String.valueOf(sc.next()),
                String.valueOf(subjects.getKorean()),
                String.valueOf(subjects.getEnglish()),
                String.valueOf(subjects.getMath()),
                String.valueOf(total),
                String.valueOf(average));


    }
}
