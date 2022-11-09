package com.bridgelabz.Day9employeewage;

public class EmpWageBuilder {
	static int FULL_TIME = 1;
    static int PART_TIME = 2;
    static int empPerHR_wage = 20;

    //
    static int empHrs = 3;
    public static void main(String[] args) {
        getEmpDailyWage();
    }

    static double getEmpDailyWage() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        double empCheck1 = Math.floor(Math.random() * 10) % 3;
        if (empCheck1 == FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
         if (empCheck1 == PART_TIME)
            empHrs = 4;
        double empWage = empHrs * empPerHR_wage;
        System.out.println("Employee Daily wage is " +empWage);

        return empWage;
    }
}

 

		 
