package com.bridgelabz.Day9employeewage;

public class EmpWageBuilder {
	static int FULL_TIME1 = 1;
    static int PART_TIME1 = 2;
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    static int empPerHR_wage = 20;

    //
    static int empHrs = 0;
    public static void main(String[] args) {
        getEmpDailyWage();
    }

    static double getEmpDailyWage() {
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == FULL_TIME1)
            empHrs = 8;
        else if (empCheck == PART_TIME)
            empHrs = 4;
        switch ((int) empCheck) {
            case FULL_TIME:
                empHrs = 8;
                break;
            case PART_TIME:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }
        double empWage = empHrs * empPerHR_wage;
        System.out.println("Employee Daily wage is " +empWage);

        return empWage;
    }

}

    

		 
