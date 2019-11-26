package com.liwei.test.excelparser.entity;

import lombok.ToString;
import org.javafunk.excelparser.annotations.ExcelField;
import org.javafunk.excelparser.annotations.ExcelObject;
import org.javafunk.excelparser.annotations.ParseType;

import java.util.Date;

/**
 * @description:
 * @author: liwei
 * @create: 2019-11-26 15:18
 **/
@ExcelObject(parseType = ParseType.ROW, start = 6, end = 8)
public class Student {
    @ExcelField(position = 2)
    private Long roleNumber;

    @ExcelField(position = 3)
    private String name;

    @ExcelField(position = 4)
    private Date dateOfBirth;

    @ExcelField(position = 5)
    private String fatherName;

    @ExcelField(position = 6)
    private String motherName;

    @ExcelField(position = 7)
    private String address;

    @ExcelField(position = 8)
    private Double totalScore;

    public Long getRoleNumber() {
        return roleNumber;
    }

    public void setRoleNumber(Long roleNumber) {
        this.roleNumber = roleNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "roleNumber=" + roleNumber + ",name=" + name +
                ",dateOfBirth=" + dateOfBirth + ",fatherName=" + fatherName +
                ",motherName=" + motherName + ",address=" + address + ",totalScore=" + totalScore;
    }
}