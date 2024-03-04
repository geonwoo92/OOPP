package service;

import model.Member;

import java.util.List;
import java.util.Map;

public interface AuthService {
    String login(Member build);

    String join(Member user);

    String addUsers();

    Member findUser(String username);

    String updatePassword(Member user);

    String deleteUser(String username);

    List<?> findUsersByName(String name);

    Map<String, ?> getUserMap();

    List<?> findUsersByJob(String job);

    String countUser();
}
