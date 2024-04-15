/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author AZAAN
 */
public class Intern {
     String internName;
     String universityName;
     String internshipPaymentStatus;
     int id;
     
    public String getInternName() {
        return internName;
    }

    public void setInternName(String internName) {
        this.internName = internName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getInternshipPaymentStatus() {
        return internshipPaymentStatus;
    }

    public void setInternshipPaymentStatus(String internshipPaymentStatus) {
        this.internshipPaymentStatus = internshipPaymentStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Intern(String internName, String universityName, String internshipPaymentStatus, int id) {
        this.internName = internName;
        this.universityName = universityName;
        this.internshipPaymentStatus = internshipPaymentStatus;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Intern{" + "internName=" + internName + ", universityName=" + universityName + ", internshipPaymentStatus=" + internshipPaymentStatus + ", id=" + id + '}';
    }
}
