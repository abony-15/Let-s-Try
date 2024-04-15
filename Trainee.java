/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author AZAAN
 */
public class Trainee {
     String internName;
     String internPosition;
     int id;
     
    public Trainee(String internName, String internPosition, int id) {
        this.internName = internName;
        this.internPosition = internPosition;
        this.id = id;
    }

    public String getInternName() {
        return internName;
    }

    public void setInternName(String internName) {
        this.internName = internName;
    }

    public String getInternPosition() {
        return internPosition;
    }

    public void setInternPosition(String internPosition) {
        this.internPosition = internPosition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Trainee{" + "internName=" + internName + ", internPosition=" + internPosition + ", id=" + id + '}';
    }
}
