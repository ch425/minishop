package com.minishop.entity;

public class PersonalIntro {
    private int id;
    private String name;
    private int age;
    private int sex;
    private String education;
    private String edu_experience;
    private String specialty;
    private String experience;
    private String tel;
    private String email;
    private String wechat;
    private String qq;
    private String personal_labels;
    private int u_id;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getSex() {
        return sex;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getU_id() {
        return u_id;
    }
    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getExperience() {
        return experience;
    }
    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPersonal_labels() {
        return personal_labels;
    }
    public void setPersonal_labels(String personal_labels) {
        this.personal_labels = personal_labels;
    }

    public String getQq() {
        return qq;
    }
    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getWechat() {
        return wechat;
    }
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getEdu_experience() {
        return edu_experience;
    }
    public void setEdu_experience(String edu_experience) {
        this.edu_experience = edu_experience;
    }

    @Override
    public String toString() {
        return "Personal_into id=" + id + ", name=" + name + ", age=" + age+ ", sex=" + sex + ", education=" + education +", edu_experience=" + edu_experience +", specialty=" + specialty +", experience=" + experience +", tel=" + tel +", email=" + email +", wechat=" + wechat +", qq=" + qq + ", personal_labels=" + personal_labels + ", u_id=" + u_id + "]";
    }
}