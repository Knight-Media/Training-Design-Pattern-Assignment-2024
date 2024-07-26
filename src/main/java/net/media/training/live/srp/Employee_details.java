package net.media.training.live.srp;

public class Employee_details {
    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private int leavesTaken;
    private int totalLeaveAllowed;
//    private int leaveTaken;
    private String manager;
    private int yearsInOrg;
    private int thisYeard;
    private int[] leavesLeftPreviously;


    public Employee_details(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public int getEmpId() {
        return this.empId;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public String getName() {
        return this.name;
    }

    public String getAddressStreet() {
        return this.addressStreet;
    }
    public String getAddressCity() {return this.addressCity;}
    public String getAddressCountry() {return this.addressCountry;}
    public int getLeavesTaken() {return this.leavesTaken;}
    public int getTotalLeaveAllowed() {return this.totalLeaveAllowed;}
    public String getManager() {return this.manager;}
    public int getYearsInOrg() {return this.yearsInOrg;}
    public int getThisYeard() {return this.thisYeard;}
    public int[] getLeavesLeftPreviously() {return this.leavesLeftPreviously;}

}
