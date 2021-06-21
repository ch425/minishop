package com.minishop.Controller;


import com.minishop.Service.UserService;
import com.minishop.entity.User;
import com.minishop.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService UserService;

    @GetMapping("/ListUser")
    @ResponseBody
    public Object ListUser(){
        List<User> data = UserService.ListUser();
        Result res = new Result();
        res.setCode(200);
        res.setMsg("请求成功");
        res.setData(data);
        return res;
    }

    @PostMapping("/ListUserByname")
    @ResponseBody
    public Object ListUserByname(String name){
        List<User> data = UserService.findByName(name);
        Result res = new Result();
        if(data.size() >= 1){
            res.setCode(200);
            res.setMsg("请求成功");
            res.setData(data);
            return res;
        } else {
            res.setCode(404);
            res.setMsg("用户名不存在");
            res.setData(data);
            return res;
        }

    }


    @PostMapping(value = "/delete")
    public Object delete(int user_id) {
        int result = UserService.delete(user_id);
        Result res = new Result();
        if (result >= 1) {
            res.setCode(200);
            res.setMsg("删除成功");
            res.setData(null);
            return res;
        } else {
            res.setCode(400);
            res.setMsg("删除失败");
            res.setData(null);
            return res;
        }
    }

    @PostMapping(value = "/update")
    public Object update(User user) {
        int result = UserService.Update(user);
        Result res = new Result();
        if (result >= 1) {
            res.setCode(200);
            res.setMsg("修改成功");
            res.setData(null);
            return res;
        } else {
            res.setCode(400);
            res.setMsg("修改失败");
            res.setData(null);
            return res;
        }

    }

    @PostMapping(value = "/insert")
    public User insert(User user) {
        return UserService.insertUser(user);
    }

}
