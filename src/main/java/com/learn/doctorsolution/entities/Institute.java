
package com.learn.doctorsolution.entities;



import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Institute{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int insId;
    private String insName;
    private String insLocation;
    
    @OneToMany(mappedBy = "institute")
    private Set<Doctor> doctors;
   
    

    public Institute(int insId, String insName, String insLocation, Set<Doctor> doctors) {
        this.insId = insId;
        this.insName = insName;
        this.insLocation = insLocation;
        this.doctors = doctors;
    }

    public Institute(String insName, String insLocation, Set<Doctor> doctors) {
        this.insName = insName;
        this.insLocation = insLocation;
        this.doctors = doctors;
    }

    public Institute() {
    }

    public int getInsId() {
        return insId;
    }

    public void setInsId(int insId) {
        this.insId = insId;
    }

    public String getInsName() {
        return insName;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public String getInsLocation() {
        return insLocation;
    }

    public void setInsLocation(String insLocation) {
        this.insLocation = insLocation;
    }

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Institute{" + "insId=" + insId + ", insName=" + insName + ", insLocation=" + insLocation + ", doctors=" + doctors + '}';
    }

   

    
    

    
    
}
