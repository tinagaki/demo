package demo.example.demo.service;

import demo.example.demo.dto.User;

import java.util.List;

/**
 * ユーザ情報サービス.
 */
public interface UserService {

    /**
     * ユーザ情報一覧の取得.
     *
     * @param userId ユーザID
     * @return ユーザ情報一覧
     */
    List<User> getUserList(String userId);
}
