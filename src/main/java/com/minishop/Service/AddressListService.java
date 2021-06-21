package com.minishop.Service;

import com.minishop.Mapper.AddressListMapper;
import com.minishop.entity.AddressList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AddressListService {
    @Autowired
    public AddressListMapper AddressListMapper;

    public List<AddressList> AddressList(){
        return AddressListMapper.AddressList();
    }

}
