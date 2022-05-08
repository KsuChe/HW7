public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //task1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();
        //task2
        String Name = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + Name);
        System.out.println();

    }
}