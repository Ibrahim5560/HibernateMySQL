package model;

import java.sql.Timestamp;

/**
 * Created by Ibrahim.mmh on 5/4/2018.
 */
public class Lecturer {
    private int id;
    private String firstName;
    private String lastName;

    public Timestamp getStartdate() {
        return startdate;
    }

    public void setStartdate(Timestamp startdate) {
        this.startdate = startdate;
    }

    private Timestamp startdate;

    public Lecturer(){}
    public Lecturer(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.startdate=new Timestamp(System.currentTimeMillis());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "[ ID = "+id+", firstName = "+firstName+" , firstName = "+lastName+" , startdate = "+startdate+" ]";
    }
}
