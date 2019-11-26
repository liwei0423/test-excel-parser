package com.liwei.test.excelparser;

import com.liwei.test.excelparser.entity.Section;
import com.liwei.test.excelparser.entity.Student;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.javafunk.excelparser.SheetParser;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @description:
 * @author: liwei
 * @create: 2019-11-26 15:19
 **/
public class Test1 {
    @Test
    public void parserExcel() {
        //Get the sheet using POI API.
        String sheetName = "Sheet1";
        SheetParser parser = new SheetParser();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("student.xls");
        Sheet sheet = null;
        try {
            sheet = new HSSFWorkbook(inputStream).getSheet(sheetName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Invoke the Sheet parser.
        List<Section> entityList = parser.createEntity(sheet, Section.class,null);
        if(entityList.size()>0){
            System.out.println(entityList.get(0).toString());
            List<Student> list = entityList.get(0).getStudents();
            for(Student student : list){
                System.out.println(student.toString());
            }
        }
    }
}
