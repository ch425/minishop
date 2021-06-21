package com.minishop.Controller;

import com.minishop.Service.PersonalService;
import com.minishop.entity.PersonalIntro;
import com.minishop.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(value = "/personal")
public class PersonController {
    
    @Autowired
    private PersonalService PersonalService;

    @PostMapping("/perfect")
    public Object perfectInfo(PersonalIntro personalIntro){
        int result = PersonalService.Update(personalIntro);
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

    @PostMapping("/insertPersonal")
    public Object insertPerfectInfo(PersonalIntro personalIntro){
        int result = PersonalService.insertPersonal(personalIntro);
        Result res = new Result();
        if (result >= 1) {
            res.setCode(200);
            res.setMsg("添加成功");
            res.setData(null);
            return res;
        } else {
            res.setCode(400);
            res.setMsg("添加失败");
            res.setData(null);
            return res;
        }
    }

    @GetMapping("/selectPersonalList")
    @ResponseBody
    public Object personalIntroList() {
        List<PersonalIntro> data = PersonalService.personalIntroList();
        Result res = new Result();
        res.setCode(200);
        res.setMsg("请求成功");
        res.setData(data);
        return res;
    }

    @GetMapping("/getPersonal")
    @ResponseBody
    public Object getPersonal(int u_id){
        List<PersonalIntro> data = PersonalService.findPersonalById(u_id);
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
}
