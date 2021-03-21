package com.helping.controller;


import com.helping.model.Employee;
import com.helping.model.User;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@RestController
@RequestMapping("/helping")
public class RegistrationController {

    @GetMapping("/testHealth")
    public String testHealth() {
        return "Helping hand is accessible!!";
    }

    @GetMapping("/createDoc")
    public String createDoc() {
        //Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        //Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Employee Data");

        //This data needs to be written (Object[])
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[]{"FIRST NAME", "LAST NAME", "MOBILE NUMBER", "CURRENT COMPANY", "CURRENT DOMAIN",
                "CURRENT LOCATION", "CURRENT PACKAGE", "EMAIL", "EMPLOYEE STATUS", "EXPECTED LOCATION",
                "EXPECTED PACKAGE", "LINKEDIN LINK", "NAUKARI LINK", "NOTICE PERIOD",
                "PASSWORD", "SEARCHING DOMAIN", "SKILLS", "WHATSAPP NUMBER"});

        //Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {
            Row row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
            }
        }
        try {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("sampleExcel.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("sampleExcel.xlsx written successfully on disk.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Doc created successfully";
    }

    private Employee getEmployee() {
        Employee employee = new Employee();
        employee.setCurrentCompany("Cybage");
        employee.setCurrentDomain("Web");
        employee.setCurrentLocation("Pune");
        employee.setCurrentPackage(15L);
        employee.setEmail("vishalrajapure@gmail.com");
        employee.setEmployeeStatus("Active");
        employee.setExpectedLocation("Pune");
        employee.setExpectedPackage(20L);
        employee.setFirstName("Vishal");
        employee.setLastName("Rajapure");
        employee.setLinkedinLink("www.linkedin/vishalrajapure");
        employee.setMobileNumber("9960743366");
        employee.setNaukariLink("www.naukari/vishalrajapure");
        employee.setNoticePeriod("3 months");
        employee.setPassword("vishal");
        employee.setSearchingDomain("Machine learning");
        employee.setSkills("Java, angular");
        employee.setWhatsappNumber("9960743366");
        return employee;
    }

    private Object[] createObjectArray(Employee employee) {
        Object[] objects = new Object[18];
        objects[0] = employee.getFirstName();
        objects[1] = employee.getLastName();
        objects[2] = employee.getMobileNumber();
        objects[3] = employee.getCurrentCompany();
        objects[4] = employee.getCurrentDomain();
        objects[5] = employee.getCurrentLocation();
        objects[6] = employee.getCurrentPackage();
        objects[7] = employee.getEmail();
        objects[8] = employee.getEmployeeStatus();
        objects[9] = employee.getExpectedLocation();
        objects[10] = employee.getExpectedPackage();
        objects[11] = employee.getLinkedinLink();
        objects[12] = employee.getNaukariLink();
        objects[13] = employee.getNoticePeriod();
        objects[14] = employee.getPassword();
        objects[15] = employee.getSearchingDomain();
        objects[16] = employee.getSkills();
        objects[17] = employee.getWhatsappNumber();
        return objects;
    }

    @PostMapping("/register")
    public Employee registerEmployee(@RequestBody Employee employee) {

        String excelFilePath = "sampleExcel.xlsx";

        try {
            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
            Workbook workbook = WorkbookFactory.create(inputStream);

            Sheet sheet = workbook.getSheetAt(0);
            Object[] objects = createObjectArray(employee);

            int rowCount = sheet.getLastRowNum();
            Row row = sheet.createRow(++rowCount);
            int columnCount = 0;
            for (Object obj : objects) {
                Cell cell = row.createCell(columnCount++);
                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                if (obj instanceof Long)
                    cell.setCellValue((Long) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
            }

            inputStream.close();
            FileOutputStream outputStream = new FileOutputStream("sampleExcel.xlsx");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return employee;
    }

    @PostMapping("/login")
    public String readDoc(@RequestBody User user) {
        try {
            FileInputStream file = new FileInputStream(new File("sampleExcel.xlsx"));

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell usernameCell = cellIterator.next();

                    if (usernameCell.getCellType() == 1 && usernameCell.getStringCellValue().equals(user.getUsername())) {
                        while (cellIterator.hasNext()) {
                            Cell passwordCell = cellIterator.next();
                            if (passwordCell.getCellType() == 1 && passwordCell.getStringCellValue().equals(user.getPassword())) {
                                return "Login Successful";
                            }
                        }
                        return "Password does not matched with username";
                    }

                }
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "username not found";
    }
}
