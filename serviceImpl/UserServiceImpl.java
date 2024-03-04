package serviceImpl;


import model.Member;
import service.UserService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {

    //    private static AuthService instance = new AuthServiceImpl();
    Map<String, Member> users;

    public UserServiceImpl() {
        this.users = new HashMap<>();
    }

    @Override
    public String addUsers() {
        Map<String, Member> map = new HashMap<>();

        UtilService util = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
            String username = UtilServiceImpl.getInstance().createRandomUsername();
            map.put(username,
                    Member.builder()
                            .username(username)
                            .password("1")
                            .verify_password("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return users.size() + "개 더미값 추가";

    }

    @Override
    public String count() {

        return users.size() + "";
    }

}


