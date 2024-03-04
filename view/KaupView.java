package view;


import model.Member;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;


public class KaupView {

    public static void main(Scanner sc) {

        UtilService util = UtilServiceImpl.getInstance();
        Member member = Member.builder()
                .height(util.createRandomDouble(150,50))
                .weight(util.createRandomDouble(30,70 ))
                .build();
        KaupService sv = KaupServiceImpl.getInstance();
        System.out.println(member.toString());
        String bmi = sv.createBMI(member);
        String bodyMass = sv.createBodyMass(bmi);
        System.out.printf("=========== BMI 계산기 ==========\n" +
                "BMI: %s\n" +
                "체질량: %s\n" +
                "=========================",
                bmi,bodyMass);

    }
}
