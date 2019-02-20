package demo.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import demo.example.demo.dto.User;
import demo.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;

/**
 * デモ用APIコントローラー.
 */
@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @Autowired
    private UserServiceImpl userService;

    public String test;

    private String test1, Test2;

    /**
     * ユーザ情報一覧取得.
     *
     * @return ユーザ情報一覧
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<User> GetUsers() {

        // ユーザ情報が存在しない場合、空のユーザ情報を返す
        if (!userService.isUser("test.user")) {
            return new ArrayList<>();
        }

        List<User> user = userService.getUserList("test.user");

        if (user.size() > 0) {
            new NullPointerException();
        }

        return userService.getUserList("test.user");
    }
}
