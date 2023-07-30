package com.hamzath;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student_table")
public class Student {

    @Id
    private int rollNum;
    private StudentName studName;

    private String contNum;

    @ManyToMany(mappedBy = "student")
    private List<Laptop> laptop = new ArrayList<Laptop>();

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public StudentName getStudName() {
        return studName;
    }

    public void setStudName(StudentName studName) {
        this.studName = studName;
    }

    public String getContNum() {
        return contNum;
    }

    public void setContNum(String contNum) {
        this.contNum = contNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", studName=" + studName +
                ", contNum='" + contNum + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
