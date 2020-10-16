package com.zy.swagger3.swagger3.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("学生数据模型")
public class Student implements Serializable {

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("姓名")
    private int age;

    @ApiModelProperty("姓名")
    private String provience;

    @ApiModelProperty("身高")
    private int high;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProvience() {
        return provience;
    }

    public void setProvience(String provience) {
        this.provience = provience;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
