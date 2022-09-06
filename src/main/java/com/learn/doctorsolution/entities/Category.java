
package com.learn.doctorsolution.entities;


import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Category{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int caId;
    private String caTitle;
    @Column(length = 500)
    private String caDescription;

    
    @OneToMany(mappedBy = "category")
    private Set<Doctor> doctors;
    
    
    public Category(int caId, String caTitle, String caDescription, Set<Doctor> doctors) {
       
        this.caId = caId;
        this.caTitle = caTitle;
        this.caDescription = caDescription;
        this.doctors = doctors;
    }

    public Category(String caTitle, String caDescription, Set<Doctor> doctors) {
       
        this.caTitle = caTitle;
        this.caDescription = caDescription;
        this.doctors = doctors;
    }

    public Category() {
       
    }

    public int getCaId() {
        return caId;
    }

    public void setCaId(int caId) {
        this.caId = caId;
    }

    public String getCaTitle() {
        return caTitle;
    }

    public void setCaTitle(String caTitle) {
        this.caTitle = caTitle;
    }

    public String getCaDescription() {
        return caDescription;
    }

    public void setCaDescription(String caDescription) {
        this.caDescription = caDescription;
    }

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctor> doctors) {
        this.doctors = doctors;
    }

   

    @Override
    public String toString() {
        return "Category{" + "caId=" + caId + ", caTitle=" + caTitle + ", caDescription=" + caDescription + ", doctors=" + doctors + '}';
    }
    
   
    
    
}
