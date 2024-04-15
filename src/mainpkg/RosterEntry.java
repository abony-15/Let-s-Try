package mainpkg;

import java.time.LocalDate;

public class RosterEntry {
    private String name;
    private String shift;
    private LocalDate date;
    private String id;

    // Constructor
    public RosterEntry(String name, String shift, LocalDate date, String id) {
        this.name = name;
        this.shift = shift;
        this.date = date;
        this.id = id;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Override toString for easy debugging
    @Override
    public String toString() {
        return "RosterEntry{" +
                "name='" + name + '\'' +
                ", shift='" + shift + '\'' +
                ", date=" + date +
                ", id='" + id + '\'' +
                '}';
    }
}
