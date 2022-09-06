
package com.learn.doctorsolution.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Doctor{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doId;
    private String doName;
    private String doEmail;
    private String doPassword;
    @Column(length = 200)
    private String doQualification;
    private String doSpacialist;
    private String doDesignation;
    @Column(length = 500)
    private String doDesciption;
    private String doPhoto;
    private int doNumber;
    
    @ManyToOne
    private Category category;
    
    
    @ManyToOne
    private Chamber chamber;
    
    
    @ManyToOne
    private Institute institute;
    
    
    
    

    public Doctor(int doId, String doName, String doEmail, String doPassword, String doQualification, String doSpacialist, String doDesignation, String doDesciption, String doPhoto, int doNumber, Category category, Chamber chamber, Institute institute) {
        this.doId = doId;
        this.doName = doName;
        this.doEmail = doEmail;
        this.doPassword = doPassword;
        this.doQualification = doQualification;
        this.doSpacialist = doSpacialist;
        this.doDesignation = doDesignation;
        this.doDesciption = doDesciption;
        this.doPhoto = doPhoto;
        this.doNumber = doNumber;
        this.category = category;
        this.chamber = chamber;
        this.institute = institute;
       
    }

    public Doctor(String doName, String doEmail, String doPassword, String doQualification, String doSpacialist, String doDesignation, String doDesciption, String doPhoto, int doNumber, Category category, Chamber chamber, Institute institute) {
        this.doName = doName;
        this.doEmail = doEmail;
        this.doPassword = doPassword;
        this.doQualification = doQualification;
        this.doSpacialist = doSpacialist;
        this.doDesignation = doDesignation;
        this.doDesciption = doDesciption;
        this.doPhoto = doPhoto;
        this.doNumber = doNumber;
        this.category = category;
        this.chamber = chamber;
        this.institute = institute;
      
    }

    public int getDoId() {
        return doId;
    }

    public void setDoId(int doId) {
        this.doId = doId;
    }

    public String getDoName() {
        return doName;
    }

    public void setDoName(String doName) {
        this.doName = doName;
    }

    public String getDoEmail() {
        return doEmail;
    }

    public void setDoEmail(String doEmail) {
        this.doEmail = doEmail;
    }

    public String getDoPassword() {
        return doPassword;
    }

    public void setDoPassword(String doPassword) {
        this.doPassword = doPassword;
    }

    public String getDoQualification() {
        return doQualification;
    }

    public void setDoQualification(String doQualification) {
        this.doQualification = doQualification;
    }

    public String getDoSpacialist() {
        return doSpacialist;
    }

    public void setDoSpacialist(String doSpacialist) {
        this.doSpacialist = doSpacialist;
    }

    public String getDoDesignation() {
        return doDesignation;
    }

    public void setDoDesignation(String doDesignation) {
        this.doDesignation = doDesignation;
    }

    public String getDoDesciption() {
        return doDesciption;
    }

    public void setDoDesciption(String doDesciption) {
        this.doDesciption = doDesciption;
    }

    public String getDoPhoto() {
        return doPhoto;
    }

    public void setDoPhoto(String doPhoto) {
        this.doPhoto = doPhoto;
    }

    public int getDoNumber() {
        return doNumber;
    }

    public void setDoNumber(int doNumber) {
        this.doNumber = doNumber;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Chamber getChamber() {
        return chamber;
    }

    public void setChamber(Chamber chamber) {
        this.chamber = chamber;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    @Override
    public String toString() {
        return "Doctor{" + "doId=" + doId + ", doName=" + doName + ", doEmail=" + doEmail + ", doPassword=" + doPassword + ", doQualification=" + doQualification + ", doSpacialist=" + doSpacialist + ", doDesignation=" + doDesignation + ", doDesciption=" + doDesciption + ", doPhoto=" + doPhoto + ", doNumber=" + doNumber + ", category=" + category + ", chamber=" + chamber + ", institute=" + institute + '}';
    }
    
    

    
    
    
}
