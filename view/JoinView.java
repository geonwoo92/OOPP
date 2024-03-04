package view;


import model.Member;

import java.util.Scanner;

public class JoinView {
    public static void main(Scanner sc) {

        System.out.println("ID,비번,비번확인,이름,주민번호,전화번호,주소를 입력해주세요");
        Member member = Member.builder()
                .username(sc.next())
                .password(sc.next())
                .verify_password(sc.next())
                .name(sc.next())
                .social_Security_Number(sc.next())
                .phone_number(sc.next())
                .address(sc.next())
                .build();


        System.out.println(member.toString());

    }
}

