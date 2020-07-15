package com.frybitsinc.thymeleaf.model;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public enum MenuModel {
    
    MENU1("MENU1", Arrays.asList("제육", "비빔밥", "오므라이스", "카레", "볶음밥", "짜장밥", "짬뽕밥", "회덮밥", "쌈밥", "김치볶음밥")),
    MENU2("MENU2", Arrays.asList("김치찌개", "부대찌개", "된장찌개", "순두부찌개", "육개장", "돼지국밥", "매운탕", "해물탕", "뼈해장국", "마라탕")),
    MENU3("MENU3", Arrays.asList("떡볶이", "핫도그", "김밥", "순대", "돈까스", "튀김", "어묵", "라볶이", "만두")),
    MENU4("MENU4", Arrays.asList("라면", "냉면", "우육탕면", "칼국수", "비빔국수", "잔치국수", "스파게티", "막국수", "쫄면")),
    MENU5("MENU5", Arrays.asList("우동", "가츠동", "하이라이스", "오코노미야끼", "초밥", "규동", "라멘", "소바", "돈부리")),
    MENU6("MENU6", Arrays.asList("삼김", "햄버거", "토스트", "컵라면", "편의점 도시락", "밥버거", "빵", "샌드위치", "죽")),
    MENU7("MENU6", Arrays.asList("치킨", "족발", "피자", "보쌈", "닭발", "곱창", "삼겹살", "어묵탕")),
    MENU8("MENU6", Arrays.asList("짜장면", "짬뽕", "볶음밥", "탕수육", "마파두부", "깐풍기", "팔보채", "고추잡채", "깐쇼새우"));
    
	private String menu;
    private List<String> list;
 
    MenuModel(String menu, List<String> list) {
        this.menu = menu;
        this.list = list;
    }
    
    public static String pick(String selected){
    	int randomNum;
    	List<String> menuList = MenuModel.valueOf(selected).list;
    	String result = menuList[randomNum];
        return result;
    }
}