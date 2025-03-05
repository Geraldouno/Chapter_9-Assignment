
public class TestBasePlusCommisionEmployee {
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "John", "Doe", "123-45-6789", 10000.0, 0.1, 500.0);

        System.out.println("Total Earnings: " + employee.earnings());
    }
}

