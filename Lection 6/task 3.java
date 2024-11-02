public class Amusement {
    private String Name;
    private String hoursOfWork;
    private String price;
    public Amusement(String Name, String hoursOfWork, String price) {
        this.Name = Name;
        this.hoursOfWork = hoursOfWork;
        this.price = price;
    }
    public void printThirdTask() {
        System.out.println("Название: " + Name);
        System.out.println("Отработанные часы: " + hoursOfWork);
        System.out.println("Стоимоть: " + price);
//
    }
    public static void main(String[] args) {
        Amusement Amusement = new Amusement("break your legs ", "1155", "750000");
        Amusement.printThirdTask();
    }
}
