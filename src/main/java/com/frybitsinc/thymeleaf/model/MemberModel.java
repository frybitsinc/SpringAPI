package com.frybitsinc.thymeleaf.model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public enum MemberModel {
    
    MEM1("줄리"),
    MEM2("알렉스"),
    MEM3("조엘"),
    MEM4("신디"),
    MEM5("젠"),
    MEM6("하나"),
    MEM7("큐"),
    MEM8("이자벨"),
    MEM9("레이"),
    MEM10("리버"),
    MEM11("데니"),
    MEM12("저스틴"),
    MEM13("후니"),
    MEM14("아이린");
    
    private String krName;
    
    MemberModel(String krName) { this.krName = krName; }
    
    public String getKrName() {return krName;}
}