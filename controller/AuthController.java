package controller;


import model.Member;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AuthController {

    AuthService authService;

    public AuthController() {
        this.authService = AuthServiceImpl.getInstance();
    }

    public Map<String, ?> getUserMap() {
        System.out.println("전체 목록 출력");
        return authService.getUserMap();
    }

    public String addUsers() {
        return authService.addUsers();
    }

    public String join(Scanner scanner) {
        System.out.println("ID, " +
                "비밀번호, " +
                "비밀번호 확인, " +
                "이름, " +
                "주민번호 " +
                "전화번호, " +
                "주소, " +
                "직업을 입력해주세요");
        return authService.join(Member.builder()
                .username(scanner.next())
                .password(scanner.next())
                .verify_password(scanner.next())
                .name(scanner.next())
                .address(scanner.next())
                .build());
    }

    public String login(Scanner scanner) {
        System.out.println("로그인할 ID 입력 : ");
        return authService.login(Member.builder()
                .username(scanner.next())
                .password(scanner.next())
                .build());
    }

    public Member findUserById(Scanner scanner) {
        System.out.println("검색할 ID 입력 : ");

        return authService.findUser(scanner.next());
    }

    public String updatePassword(Scanner scanner) {
        System.out.println("수정할 ID 입력 : ");
        System.out.println("수정할 비번 입력 : ");
        return authService.updatePassword(Member.builder()
                .username(scanner.next())
                .password(scanner.next())
                .build());
    }


    public String deleteUser(Scanner scanner) {
        System.out.println("삭제할 ID 입력 : ");

        return authService.deleteUser(scanner.next());

    }


    public List<?> findUsersByName(Scanner scanner) {
        System.out.println("이름으로 검색");
        return authService.findUsersByName(scanner.next());
    }

    public List<?> findUsersByJob(Scanner scanner) {
        System.out.println("직업으로 검색");
        return authService.findUsersByJob(scanner.next());
    }

    public String countUsers() {
        System.out.println("회원수");
        return authService.countUser();
    }

    public String addUser() {
        return authService.addUsers();
    }
}

