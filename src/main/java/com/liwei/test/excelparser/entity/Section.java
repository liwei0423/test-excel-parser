package com.liwei.test.excelparser.entity;

import org.javafunk.excelparser.annotations.ExcelField;
import org.javafunk.excelparser.annotations.ExcelObject;
import org.javafunk.excelparser.annotations.MappedExcelObject;
import org.javafunk.excelparser.annotations.ParseType;

import java.util.List;

/**
 * @description:
 * @author: liwei
 * @create: 2019-11-26 15:17
 **/
@ExcelObject(parseType = ParseType.COLUMN, start = 2, end = 2)
public class Section {
    @ExcelField(position = 2)
    private String year;

    @ExcelField(position = 3)
    private String section;

    @MappedExcelObject
    private List<Student> students;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "year=" + year + ",section=" + section;
    }
}
