public class StartApp {
    Employee employees;
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван Иванович", 3, 33_000);
        Employee employee2 = new Employee("Алексеев Алексей Алексеевич", 1, 40_000);
        Employee employee3 = new Employee("Антонов Антон Антонович", 1, 41_000);
        Employee employee4 = new Employee("Егоров Егор Егорович", 3, 28_500);
        Employee employee5 = new Employee("Васильев Василий Васильевич", 2, 142_000);
        Employee employee6 = new Employee("Анатольев Анатолий Анатольевич", 2, 100_000);
        Employee employee7 = new Employee("Захаров Захар Захарович", 5, 88_500);
        Employee employee8 = new Employee("Артемов Артем Артемович", 4, 18_900);
        Employee employee9 = new Employee("Вадимов Вадим Вадимович", 2, 108_500);
        Employee employee10 = new Employee("Петров Петр Петрович", 5, 92_400);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10};


        System.out.println("employee2.getId() = " + employee2.getId());

        System.out.println(employee2.toString());

    }
}
