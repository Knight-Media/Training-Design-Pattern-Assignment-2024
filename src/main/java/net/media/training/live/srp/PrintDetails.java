package net.media.training.live.srp;

public class PrintDetails {
    public String toHtml(Employee_details employee_details) {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee_details.getEmpId() + "'>" +
                "<span>" + employee_details.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (employee_details.getTotalLeaveAllowed() - employee_details.getLeavesTaken()) + "</span>";
        str += "<span>" + Math.round(employee_details.getMonthlySalary() * 12) + "</span>";
        if (employee_details.getManager() != null) str += "<span>" + employee_details.getManager() + "</span>";
        else str += "<span>None</span>";
        int years = 3;
        if (employee_details.getYearsInOrg() < 3) {
            years = employee_details.getYearsInOrg();
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += employee_details.getLeavesLeftPreviously()[employee_details.getYearsInOrg()-i-1];
        }
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }
}
