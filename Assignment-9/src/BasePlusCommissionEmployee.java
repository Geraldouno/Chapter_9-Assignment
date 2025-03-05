
public class BasePlusCommissionEmployee {
    private CommissionEmployee commissionEmployee; 
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn,
                                      double grossSales, double commissionRate, double baseSalary) {
        commissionEmployee = new CommissionEmployee(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }


    public double earnings() {
        return baseSalary + commissionEmployee.earnings();
    }

    public String getFirstName() {
        return commissionEmployee.getFirstName();
    }

    public String getLastName() {
        return commissionEmployee.getLastName();
    }

    public String getSocialSecurityNumber() {
        return commissionEmployee.getSocialSecurityNumber();
    }

    public double getGrossSales() {
        return commissionEmployee.getGrossSales();
    }

    public double getCommissionRate() {
        return commissionEmployee.getCommissionRate();
    }
}

