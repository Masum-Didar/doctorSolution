
package com.learn.doctorsolution.entities;



import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Chamber{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chId;
    private String chName;
    private String chAddress;
    private int chNumber;
    private String chApoDateAndTime;
    
    @OneToMany(mappedBy = "chamber")
    private Set<Doctor> doctors;
    
   

    public Chamber(int chId, String chName, String chAddress, int chNumber, String chApoDateAndTime) {
        this.chId = chId;
        this.chName = chName;
        this.chAddress = chAddress;
        this.chNumber = chNumber;
        this.chApoDateAndTime = chApoDateAndTime;
    }

    public Chamber(String chName, String chAddress, int chNumber, String chApoDateAndTime, Set<Doctor> doctors) {
        this.chName = chName;
        this.chAddress = chAddress;
        this.chNumber = chNumber;
        this.chApoDateAndTime = chApoDateAndTime;
        this.doctors = doctors;
    }

    public Chamber() {
    }
    

    public int getChId() {
        return chId;
    }

    public void setChId(int chId) {
        this.chId = chId;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public String getChAddress() {
        return chAddress;
    }

    public void setChAddress(String chAddress) {
        this.chAddress = chAddress;
    }

    public int getChNumber() {
        return chNumber;
    }

    public void setChNumber(int chNumber) {
        this.chNumber = chNumber;
    }

    public String getChApoDateAndTime() {
        return chApoDateAndTime;
    }

    public void setChApoDateAndTime(String chApoDateAndTime) {
        this.chApoDateAndTime = chApoDateAndTime;
    }

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Chamber{" + "chId=" + chId + ", chName=" + chName + ", chAddress=" + chAddress + ", chNumber=" + chNumber + ", chApoDateAndTime=" + chApoDateAndTime + ", doctors=" + doctors + '}';
    }

   
    
    
    
    
}
