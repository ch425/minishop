package com.minishop.Service;

import com.minishop.Mapper.PersonalMapper;
import com.minishop.entity.PersonalIntro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalService {
    @Autowired
    public PersonalMapper PersonalMapper;

    public List<PersonalIntro> personalIntroList(){
        return PersonalMapper.selectList();
    }

    public List<PersonalIntro> findPersonalById(int u_id){
        return PersonalMapper.findPersonalById(u_id);
    }

    public int insertPersonal(PersonalIntro personalIntro) {
        return PersonalMapper.insertPersonal(personalIntro);
    }

    public int Update(PersonalIntro personalIntro){
        return PersonalMapper.Update(personalIntro);
    }
}
