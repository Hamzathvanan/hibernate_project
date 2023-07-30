package com.hamzath;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "laptop_table")
public class Laptop {
    @Id
    private int lid;
    private LapModel modelDetail;
    private int warranty;

    @ManyToMany
    private List<Student> student = new ArrayList<Student>();

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public LapModel getModelDetail() {
        return modelDetail;
    }

    public void setModelDetail(LapModel modelDetail) {
        this.modelDetail = modelDetail;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", modelDetail=" + modelDetail +
                ", warranty=" + warranty +
                ", student=" + student +
                '}';
    }
}
