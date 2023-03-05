public class DataBaseCompany {
    private static Employee[] employees;
    private int size;

    public DataBaseCompany() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String fullName, int department, int salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
        }
        Employee newEmployee = new Employee(fullName, department, salary);
        employees[size++] = newEmployee;
    }


    public void printAllEmployeesFullNames() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getFullName());
        }
    }


    public static void main(String[] args) {

        DataBaseCompany dataBaseCompany = new DataBaseCompany();
        dataBaseCompany.addEmployee("Иванов Иван Иванович", 3, 33_000);
        dataBaseCompany.addEmployee("Алексеев Алексей Алексеевич", 1, 40_000);
        dataBaseCompany.addEmployee("Антонов Антон Антонович", 1, 41_000);
        dataBaseCompany.addEmployee("Егоров Егор Егорович", 3, 28_500);
        dataBaseCompany.addEmployee("Васильев Василий Васильевич", 2, 142_000);
        dataBaseCompany.addEmployee("Анатольев Анатолий Анатольевич", 2, 100_000);
        dataBaseCompany.addEmployee("Захаров Захар Захарович", 5, 88_500);
        dataBaseCompany.addEmployee("Артемов Артем Артемович", 4, 18_900);
        dataBaseCompany.addEmployee("Вадимов Вадим Вадимович", 2, 108_500);
        dataBaseCompany.addEmployee("Петров Петр Петрович", 5, 92_400);

        dataBaseCompany.printAllEmployeesFullNames();


//        Employee employee1 = new Employee("Иванов Иван Иванович", 3, 33_000);
//        Employee employee2 = new Employee("Алексеев Алексей Алексеевич", 1, 40_000);
//        Employee employee3 = new Employee("Антонов Антон Антонович", 1, 41_000);
//        Employee employee4 = new Employee("Егоров Егор Егорович", 3, 28_500);
//        Employee employee5 = new Employee("Васильев Василий Васильевич", 2, 142_000);
//        Employee employee6 = new Employee("Анатольев Анатолий Анатольевич", 2, 100_000);
//        Employee employee7 = new Employee("Захаров Захар Захарович", 5, 88_500);
//        Employee employee8 = new Employee("Артемов Артем Артемович", 4, 18_900);
//        Employee employee9 = new Employee("Вадимов Вадим Вадимович", 2, 108_500);
//        Employee employee10 = new Employee("Петров Петр Петрович", 5, 92_400);
//
//        Employee[] employees = {employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10};
//
//
//        System.out.println("employee2.getId() = " + employee2.getId());
//
//        System.out.println(employee2.toString());

    }
}
