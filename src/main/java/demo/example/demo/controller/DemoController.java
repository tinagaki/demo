package demo.example.demo.controller;

import demo.example.demo.dto.User;
import demo.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * デモ用APIコントローラー.
 */
@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @Autowired
    private UserServiceImpl userService;

    /**
     * ユーザ情報一覧取得.
     *
     * @return ユーザ情報一覧
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers() {

        return userService.getUserList("test.user");
    }
}
