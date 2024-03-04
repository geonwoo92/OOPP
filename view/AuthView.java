package view;

import controller.AuthController;

import java.util.Scanner;

public class AuthView {
    public static void main(Scanner sc) {
        AuthController authController = new AuthController();
        String msg = authController.addUser();
        System.out.println("authController.addUser: 결과" + msg);
        while (true) {
            System.out.println("[관리자메뉴] 0-종료\n " +
                    "1-회원가입\n " +
                    "2-로그인\n " +
                    "3-ID검색\n " +
                    "4-비번변경\n" +
                    "5-회원탈퇴\n " +
                    "6-회원목록\n " +
                    "7-이름검색\n" +
                    "8-직업검색\n" +
                    "9-회원수");
            switch (sc.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("1-회원가입");
                    System.out.println("회원가입 결과 : " + authController.join(sc));
                    break;
                case "2":
                    System.out.println("2-로그인");
                    System.out.println("로그인 결과: " + authController.login(sc));
                    break;
                case "3":
                    System.out.println("3-ID검색");
                    authController.findUserById(sc);
                    break;
                case "4":
                    System.out.println("4-비번변경");
                    authController.updatePassword(sc);
                    break;
                case "5":
                    System.out.println("5-탈퇴");
                    authController.deleteUser(sc);
                    break;
                case "6":
                    System.out.println("6-회원목록");
                    authController.getUserMap().forEach((k, v) -> {
                        System.out.printf("아이디: %s, 회원정보: %s", k, v);
                    });
                    break;
                case "7":
                    System.out.println("7-이름검색");
                    authController.findUsersByName(sc).forEach((i) -> {
                        System.out.println(i);
                    });
                    break;
                case "8":
                    System.out.println("8-직업검색");
                    authController.deleteUser(sc);
                    break;
                case "9":
                    System.out.println("9-회원수");
                    System.out.println(authController.countUsers());
                    break;

            }
        }

    }
}