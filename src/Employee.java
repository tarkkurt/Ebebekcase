public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public int tax() {
        if (salary >= 1000) {
            return 3 * salary / 100;
        }
        return 0;
    }

    public int bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    public int raiseSalary() {
        int yearsOfService = 2021 - hireYear;
        int netSalary = salary+bonus()-tax();
        if (yearsOfService < 10) {
            return 5 * netSalary / 100;
        }
        else if (yearsOfService > 9 && yearsOfService < 20) {
            return 10 * netSalary / 100;
        }
        else
            return 15 * netSalary / 100;

    }


    @Override
    public String toString() {
        return "Çalışanın bilgileri:\n" +"Çalışanın ismi: " + name + "\n" + "Net Maaşı: " + salary +"\n"
                +"Haftalık çalışma saati: " + workHours + "\n" + "İşe başlangıç yılı: " + hireYear + "\n" +
                "Çalışanın ödediği vergi: " + tax() + "\n" + "Çalışanın bonusu: " + bonus() + "\n" +
                "Çalışanın maaş artışı: " + raiseSalary();
    }
}
