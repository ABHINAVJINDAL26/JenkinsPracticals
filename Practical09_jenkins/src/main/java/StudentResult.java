package main.java;

public class StudentResult {

    public String checkResult(int marks) {

        if(marks < 0 || marks > 100) {
            return "INVALID";
        }

        if(marks >= 40) {
            return "PASS";
        }

        return "FAIL";
    }
}