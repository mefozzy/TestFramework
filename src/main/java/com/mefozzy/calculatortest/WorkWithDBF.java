package com.mefozzy.calculatortest;

import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFReader;
import com.linuxense.javadbf.DBFWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

/* @author Alex Ilnitsky */
public class WorkWithDBF {

    public ArrayList<Object> Cases = new ArrayList();
    private File file;
//"TestCases.dbf"

    WorkWithDBF(String filename) {
        this.file = new File(filename);
    }

    public void DBFread() throws Exception {
        Object[] rowObjects;
        if (file == null) {
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        DBFReader dbfReader = new DBFReader(fis);
        while ((rowObjects = dbfReader.nextRecord()) != null) {
            for (Object o : rowObjects) {
                if (!Cases.add(o)) {
                    System.out.println(o);
                }
            };
        }
        fis.close();
    }

    public void calculatedExpected() throws Exception {

        DBFread();

        DBFField fields[] = new DBFField[4];
        fields[0] = new DBFField();
        fields[0].setName("VALUEA");
        fields[0].setDataType(DBFField.FIELD_TYPE_C);
        fields[0].setFieldLength(10);

        fields[1] = new DBFField();
        fields[1].setName("VALUEB");
        fields[1].setDataType(DBFField.FIELD_TYPE_C);
        fields[1].setFieldLength(10);

        fields[2] = new DBFField();
        fields[2].setName("OPEARTION");
        fields[2].setDataType(DBFField.FIELD_TYPE_C);
        fields[2].setFieldLength(1);

        fields[3] = new DBFField();
        fields[3].setName("EXPECTED");
        fields[3].setDataType(DBFField.FIELD_TYPE_C);
        fields[3].setFieldLength(10);

        DBFWriter writer = new DBFWriter();
        writer.setFields(fields);

        int i = 0;
        Object rowData[] = new Object[4];
        for (Object a : Cases) {

            if (((i + 1) % 4) == 0) {
                rowData[i] = String.valueOf((int) rowData[i - 3] / (int) rowData[i - 2]);
            } else {
                rowData[i] = a.toString().trim();
            }

            writer.addRecord(rowData);
            i++;
        }
        file.delete();
        FileOutputStream fos = new FileOutputStream(file);
        writer.write(fos);
        fos.close();

    }
}
