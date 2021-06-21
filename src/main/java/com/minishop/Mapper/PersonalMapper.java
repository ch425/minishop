package com.minishop.Mapper;



import org.apache.ibatis.annotations.Mapper;
import com.minishop.entity.PersonalIntro;

import java.util.List;

@Mapper
public interface PersonalMapper {

    public int insertPersonal(PersonalIntro personalIntro);

    public int Update(PersonalIntro personalIntro);

    List<PersonalIntro> findPersonalById(int u_id);

    List<PersonalIntro> selectList();
}
