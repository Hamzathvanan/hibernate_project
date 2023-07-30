package com.hamzath;

import javax.persistence.Embeddable;

@Embeddable
public class LapModel {
    private String modelNum;
    private String brandNum;

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public String getBrandNum() {
        return brandNum;
    }

    public void setBrandNum(String brandNum) {
        this.brandNum = brandNum;
    }

    @Override
    public String toString() {
        return "LapModel{" +
                "modelNum='" + modelNum + '\'' +
                ", brandNum='" + brandNum + '\'' +
                '}';
    }
}
