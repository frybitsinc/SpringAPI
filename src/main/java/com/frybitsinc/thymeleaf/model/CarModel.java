package com.frybitsinc.thymeleaf.model;

public enum CarModel {
    
    Rice("밥"),
    Soup("국/탕"),
    Snack("분식"),
    Noodle("면"),
    Japanese("일식"),
    Tired("다 귀찮"),
    Anjoo("야식/술안주"),
    Chinese("중식");
    
    private String krName;
    
    CarModel(String krName) { this.krName = krName; }
    
    public String getKrName() {return krName;}
    
    /*
    Rice, 
    Soup,  
    Snack,  
    Noodle,  
    Japanese, 
    Anjoo,  
    Chinese,   
    Whatever,  */
}