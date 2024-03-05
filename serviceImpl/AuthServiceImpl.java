package serviceImpl;


import model.Member;
import service.AuthService;
import service.UtilService;

import java.util.*;


public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<String,Member> users;
    List<?> userList;

    private AuthServiceImpl() {
        this.users = new HashMap<>();
        this.userList = new ArrayList<>();

    }

    public static AuthService getInstance() {
        return instance;
    }

    @Override
    public String login(Member user) {
        String msg = "";
        Member userInMap = users.get(user.getUsername());
        if (userInMap == null) {
            msg = "해당 아이디가 존재하지 않습니다.";
        } else {
            if (userInMap.getPassword().equals(user.getPassword())) {
                msg = "로그인 성공";
            } else {
                msg = "비밀번호 틀림";
            }
        }
        return msg;
    }

    @Override
    public String join(Member user) {
        users.put(user.getUsername(), user);
        return "회원가입 성공";
    }

    @Override
    public String addUsers() {
        Map<String, Member> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
            String username = UtilServiceImpl.getInstance().createRandomUsername();
            map.put(username, Member.builder().username(username).password("1").verify_password("1").name(util.createRandomName()).build());
        }
        users = map;
        return "성공";

    }

    @Override
    public Member findUser(String username) {
        Member userIn = users.get(username);

        if (userIn == null) {
            System.out.println("해당 아이디가 존재하지 않습니다");
            return null;
        } else if (userIn.getUsername().equals(username)) {
            System.out.println("회원을 찾았습니다.");
            return userIn;
        }
        return userIn;
    }

    @Override
    public String updatePassword(Member user) {
        users.get(user.getUsername()).setPassword(user.getPassword());
        return "비번성공";

    }

    @Override
    public String deleteUser(String username) {
        users.remove(username);
        return "회원삭제";
    }

    @Override
    public List<?> findUsersByName(String name) {
        return null;
    }

    @Override
    public Map<String, ?> getUserMap() {
        return users;
    }

    @Override
    public List<?> findUsersByJob(String job) {
        return null;
    }

    @Override
    public String countUser() {
        return users.size() + "";
    }
}
