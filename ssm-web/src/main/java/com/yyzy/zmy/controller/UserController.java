package com.yyzy.zmy.controller;

import com.yyzy.zmy.entry.User;
import com.yyzy.zmy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test")
    public void test(HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        List<User> users = userService.getUsers();
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
        out.println(users);
        out.flush();
        out.close();
    }

    @RequestMapping(value = "/file")
    public  String sendFile(){

        return "file.jsp";
    }
}
