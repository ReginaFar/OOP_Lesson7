public class main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Василий", "Смирнов", "Дизайн", 85990.5);
        Employee employee2 = new Employee("Василий", "Смирнов", "Маркетинг", 105340.5);
        Employee employee3 = new Employee("Сергей", "Смирнов", "Продажи", 90300.5);
        Employee employee4 = new Employee("Павел", "Князев", "Дизайн", 150300.5);

        System.out.println(employee1.equals(employee2));
        System.out.println(employee2.equals(employee3));
        System.out.println(employee1.equals(employee4));

        System.out.println(employee1.hashCode() == employee2.hashCode());
        System.out.println(employee2.hashCode() == employee3.hashCode());

    }
}
