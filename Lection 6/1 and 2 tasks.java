public class Sotrudnik {
    private String Name;
    private String position;
    private String email;
    private String phone;
    private int age;
    private double income;
    public Sotrudnik(String Name, String position, String email, String phone, int age, double income) {
        this.Name = Name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.income = income;
    }
    public void showInfoFirstTask() {
        System.out.println("Employee: " + Name);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phone);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + income + "\n");
    }
    public static void main(String[] args) {
        Sotrudnik employee = new Sotrudnik("Slim Shady", "Musician", "example@mail.com", "+8112930223", 52, 50000);
        System.out.println("\nFisrt Task\n");
        employee.showInfoFirstTask();
        System.out.println("Second Task\n");
        employee.showInfoSecondTask();
    }
    public void showInfoSecondTask() {
        Sotrudnik[] persArray = new Sotrudnik[5];
        persArray[0] = new Sotrudnik("Валерий Всепропалов", "Кладовщик", "example@mail.com", "+8112930223", 35, 21000);
        persArray[1] = new Sotrudnik("Мария Цукенберг", "Программист", "example@mail.com", "+8112930223", 29, 78000);
        persArray[2] = new Sotrudnik("Алексей Кант", "Аналитик", "example@mail.com", "+8112930223", 40, 44000);
        persArray[3] = new Sotrudnik("Ольга Косая", "HR", "example@mail.com", "+8112930223", 32, 49000);
        persArray[4] = new Sotrudnik("Николай Лебедев", "Дизайнер", "example@mail.com", "+8112930223", 28, 52500);
        for (Sotrudnik Sotrudnik : persArray) Sotrudnik.showInfoFirstTask();
    }
}
