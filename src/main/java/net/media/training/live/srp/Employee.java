package net.media.training.live.srp;


public class Employee {

    Employee_details employee_details;
    PrintDetails printObj = new PrintDetails();

    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        employee_details = new Employee_details(empId, monthlySalary, name, addressStreet, addressCity, addressCountry, leavesTaken, leavesLeftPreviously);
        printObj = new PrintDetails();
    }

//    Printing Details



    public String toHtml() {
        return printObj.toHtml(employee_details);
    }
    //other method related to customer
}
