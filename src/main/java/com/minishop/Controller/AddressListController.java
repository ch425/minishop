package com.minishop.Controller;


import com.minishop.Service.AddressListService;
import com.minishop.entity.AddressList;
import com.minishop.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(value = "/address")
public class AddressListController {
    @Autowired
    private AddressListService AddressListService;

    @GetMapping("/addressList")
    public Object addressList(){
        List<AddressList> data = AddressListService.AddressList();
        Result res = new Result();
        res.setCode(200);
        res.setMsg("请求成功");
        res.setData(data);
        return res;
    }
}
