package demo.example.demo.service.impl;

import demo.example.demo.dto.User;
import demo.example.demo.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * ユーザ情報サービス.
 */
@Component
public class UserServiceImpl implements UserService {

    /**
     * ユーザ情報一覧の取得.
     *
     * @param userId ユーザID
     * @return ユーザ情報一覧
     */
    @Override
    public List<User> getUserList(final String userId) {

        User user = new User();
        user.setId(1);
        user.setName("山田　太郎");
        user.setTel("999-9999-9999");
        user.setAddress("住所");

        List<User> userList = new ArrayList<User>();
        userList.add(user);

        return userList;
    }

    /**
     * ユーザの存在チェック.
     *
     * @param userId ユーザID
     * @return true: 存在する false: 存在しない
     */
    @Override
    public boolean isUser(final String userId) {

        // TODO ユーザ情報取得

        return true;
    }
}
