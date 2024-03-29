public class DataBaseCompany {
    private static Employee[] employees;
    private int size;

    public DataBaseCompany() {
        this.employees = new Employee[10];
    }

//    реализовал метод, добавляющий сотрудников
    public void addEmployee(String fullName, int department, int salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
        }
        Employee newEmployee = new Employee(fullName, department, salary);
        employees[size++] = newEmployee;
    }

//      реализовал метод, выводящий всю информацию
    public void printAllInformation() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].toString());
        }
    }

//    реализовал метод, выводящий все ФИО
    public void printAllEmployeesFullNames() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getFullName());
        }
    }


    //    реализовал метод, суммирующий все зарплаты
    public void calculateSalary() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += employees[i].getSalary();
        }
        System.out.println("Сумма трат на зарплаты за месяц: " + sum + " рублей");
    }

    //    реализовал метод по поиску самого низкооплачиваемого сотрудника
    public void findMinimalSalaryWorker() {
        Employee minimalSalaryWorker = employees[0];
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < minimalSalaryWorker.getSalary()) {
                minimalSalaryWorker = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minimalSalaryWorker.getFullName());
    }

    //    реализовал метод, находящий среднее значение зарплат
    public void findAverageSalary() {
        double averageSalary = 0;
        for (int i = 0; i < size; i++) {
            averageSalary += employees[i].getSalary();
        }
        averageSalary = averageSalary / size;
        System.out.println("Среднее значение зарплат: " + averageSalary + " рублей");
    }

    //    реализовал метод по поиску самого высокооплачиваемого сотрудника
    public void findHighestSalaryWorker() {
        Employee highestSalaryWorker = employees[0];
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > highestSalaryWorker.getSalary()) {
                highestSalaryWorker = employees[i];
            }
        }
        System.out.println("Сотрудник с наибольшей зарплатой: " + highestSalaryWorker.getFullName());
    }

    //    реализовал метод, индексирующий все зарплаты на 25%
    public void indexSalary() {
        int percent = 25;
        for (int i = 0; i < size; i++) {
            employees[i].setSalary(employees[i].getSalary() * percent / 100 + employees[i].getSalary());
        }
    }

    //    реализовал метод по поиску самого низкооплачиваемого сотрудника в отделе
    public void findMinimalSalaryWorkerOfDepartment(int department) {
        Employee minimalSalaryWorkerOfDepartment = employees[0];
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                minimalSalaryWorkerOfDepartment = employees[i];
                break;
            }
        }
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department && employees[i].getSalary() < minimalSalaryWorkerOfDepartment.getSalary()) {
                minimalSalaryWorkerOfDepartment = employees[i];
            }
        }
        System.out.println("Сотрудник с наименьшей зарплатой в " + department + " отделе: " + minimalSalaryWorkerOfDepartment.getFullName());
    }

    //    реализовал метод по поиску самого высокооплачиваемого сотрудника в отделе
    public void findHighestSalaryWorkerOfDepartment(int department) {
        Employee highestSalaryWorkerOfDepartment = employees[0];
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                highestSalaryWorkerOfDepartment = employees[i];
                break;
            }
        }
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department && employees[i].getSalary() > highestSalaryWorkerOfDepartment.getSalary()) {
                highestSalaryWorkerOfDepartment = employees[i];
            }
        }
        System.out.println("Сотрудник с наибольшей зарплатой в " + department + " отделе: " + highestSalaryWorkerOfDepartment.getFullName());
    }

    //    реализовал метод, суммирующий все зарплаты по отделу
    public void calculateSalaryOfDepartment(int department) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department){
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Сумма трат на зарплаты за месяц в " + department + " отделе: " + sum + " рублей");
    }

    //    реализовал метод, находящий среднюю зарплату по отделу
    public void findAverageSalaryOfDepartment(int department) {
        double sum = 0;
        int employeesOfDepartment = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department){
                sum += employees[i].getSalary();
                employeesOfDepartment ++;
            }
        }
        sum = sum / employeesOfDepartment;
        System.out.println("Средняя зарплата в " + department + " отделе: " + sum + " рублей");
    }

    //    реализовал метод, индексирующий все зарплаты отдела на процент
    public void indexSalaryOfDepartment(int percent, int department) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() * percent / 100 + employees[i].getSalary());
            }
        }
    }

    //      реализовал метод, выводящий всю информацию, кроме отдела
    public void printAllInformationOfDepartment(int department) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].toString());
            }
        }
    }

    //    реализовал метод по поиску сотрудников с зарплатой ниже определенного числа
    public void findWorkersWithSalaryBelowParameter(int salary) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < salary) {
                System.out.println("Сотрудник с зарплатой меньше " + salary + ": " + "id " + employees[i].getId() + ", " + employees[i].getFullName() + ", зарплата " + employees[i].getSalary() + " рублей");
            }
        }
    }

    //    реализовал метод по поиску сотрудников с зарплатой выше определенного числа
    public void findWorkersWithSalaryHigherParameter(int salary) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() >= salary) {
                System.out.println("Сотрудник с зарплатой больше " + salary + ": " + "id " + employees[i].getId() + ", " + employees[i].getFullName() + ", зарплата " + employees[i].getSalary() + " рублей");
            }
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
        dataBaseCompany.addEmployee("Петров Петр Петрович", 5, 22_400);


        dataBaseCompany.printAllInformation();

        dataBaseCompany.calculateSalary();

        dataBaseCompany.findMinimalSalaryWorker();

        dataBaseCompany.findHighestSalaryWorker();

        dataBaseCompany.findAverageSalary();

        dataBaseCompany.printAllEmployeesFullNames();

        dataBaseCompany.calculateSalaryOfDepartment(1);

        dataBaseCompany.findAverageSalaryOfDepartment(2);

        dataBaseCompany.indexSalary();
        dataBaseCompany.printAllInformation(); // проверка индексации

        dataBaseCompany.findMinimalSalaryWorkerOfDepartment(3);

        dataBaseCompany.findHighestSalaryWorkerOfDepartment(4);


        dataBaseCompany.indexSalaryOfDepartment(10, 5);
        dataBaseCompany.printAllInformation(); // проверка индексации

        dataBaseCompany.printAllInformationOfDepartment(1);


        dataBaseCompany.findWorkersWithSalaryBelowParameter(60_000);

        dataBaseCompany.findWorkersWithSalaryHigherParameter(45_000);

    }
}
