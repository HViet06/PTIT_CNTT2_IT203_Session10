package SS10.ex5;


abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
}


interface BonusCalculator {
    double getBonus();
}


class OfficeStaff extends Employee {

    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee implements BonusCalculator {

    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + getBonus();
    }
}


public class ex5 {
    public static void main(String[] args) {

        Employee staff = new OfficeStaff("Lan", 8000);
        Employee manager = new Manager("Minh", 15000, 5000);



        System.out.println("Nhân viên: " + staff.name);
        System.out.println("Lương cơ bản: " + staff.baseSalary);
        System.out.println("Thưởng: Không có");
        System.out.println("Lương thực nhận: " + staff.calculateSalary());
        System.out.println();

        System.out.println("Nhân viên: " + manager.name);
        System.out.println("Lương cơ bản: " + manager.baseSalary);
        System.out.println("Thưởng: " + ((Manager) manager).getBonus());
        System.out.println("Lương thực nhận: " + manager.calculateSalary());
    }
}