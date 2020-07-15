package com.frybitsinc.thymeleaf.model;

public enum CarModel {
    
    MENU1("밥"),
    MENU2("국/탕"),
    MENU3("분식"),
    MENU4("면"),
    MENU5("일식"),
    MENU6("다 귀찮"),
    MENU7("야식/술안주"),
    MENU8("중식");
    
    private String krName;
    
    CarModel(String krName) { this.krName = krName; }
    
    public String getKrName() {return krName;}
    
}