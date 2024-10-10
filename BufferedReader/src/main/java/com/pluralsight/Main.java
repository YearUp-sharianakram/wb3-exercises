package com.pluralsight;

import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("employees.csv");
        BufferedReader bufReader = new BufferedReader(fileReader);
        String input;
        bufReader.readLine();
        while((input = bufReader.readLine()) != null){
            String[] tokens = input.split(Pattern.quote("|"));
            int employeeId = Integer.parseInt(tokens[0]);
            String name = tokens[1];
            double hoursWorked = Double.parseDouble(tokens[2]);
            double payRate = Double.parseDouble(tokens[3]);
            Employee employee  = new Employee(employeeId, name, hoursWorked, payRate);
            System.out.printf("%d %s %.2f%n" , employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
        }

        bufReader.close();
    }
}