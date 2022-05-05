/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author gei
 */
public class Student {
    private String fname;
    private String lname;
    private double fee;
    private ArrayList<Course> courseList;

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void addCourse(Course c){
        courseList.add(c);
    }

    public Student(String fname, String lname, double fee) {
        this.fname = fname;
        this.lname = lname;
        this.fee = fee;
        courseList = new ArrayList();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" + "fname=" + fname + ", lname=" + lname + ", fee=" + fee + ", courseList=" + courseList + '}';
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.fname);
        hash = 43 * hash + Objects.hashCode(this.lname);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.fee) ^ (Double.doubleToLongBits(this.fee) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (Double.doubleToLongBits(this.fee) != Double.doubleToLongBits(other.fee)) {
            return false;
        }
        if (!Objects.equals(this.fname, other.fname)) {
            return false;
        }
        return Objects.equals(this.lname, other.lname);
    }
    
}
