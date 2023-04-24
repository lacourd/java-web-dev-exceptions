package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Divide(10, 2);
        Divide(5,2);
//        Divide(10, 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (Map.Entry<String, String> student : studentFiles.entrySet()) {
            System.out.println(student.getKey() + ": " + CheckFileExtension(student.getValue()));
        }
    }

    public static double Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new ArithmeticException("You cannot divide by zero!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        return x/y;
    }

    public static int CheckFileExtension(String fileName) {
        if (fileName.contains(".java")) {
            return 1;
        } else if (fileName.equals(null) || fileName.equals("")) {
            try {
                throw new Exception("You didn't submit anything!");
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        } else {
                return 0;
            }
        }
}
