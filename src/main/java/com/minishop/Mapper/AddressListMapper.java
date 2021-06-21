package com.minishop.Mapper;

import com.minishop.entity.AddressList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressListMapper {
    public List<AddressList> AddressList();
}
