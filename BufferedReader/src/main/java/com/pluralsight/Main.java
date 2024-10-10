package com.pluralsight;

import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("employees.csv");
        FileWriter fileWriter = new FileWriter("new_employees.csv");
        BufferedReader bufReader = new BufferedReader(fileReader);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);
        String input;
        bufReader.readLine();
        bufWriter.write("id|name|gross pay\n");
        while((input = bufReader.readLine()) != null){
            String[] tokens = input.split(Pattern.quote("|"));
            int employeeId = Integer.parseInt(tokens[0]);
            String name = tokens[1];
            double hoursWorked = Double.parseDouble(tokens[2]);
            double payRate = Double.parseDouble(tokens[3]);
            Employee employee  = new Employee(employeeId, name, hoursWorked, payRate);
            String text = (employee.getEmployeeId() + "|" + employee.getName() + "|" + employee.getGrossPay() + "\n");
            bufWriter.write(text);

        }
        bufReader.close();
        bufWriter.close();


    }
}