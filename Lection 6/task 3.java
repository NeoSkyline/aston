public class Park {
    private String parkname;

    public Park(String parkname) {
        this.parkname = parkname;
    }
    public class Attractions {
        private String atrName;
        private String hoursOfWork;
        private String price;
        public Attractions(String atrName, String hoursOfWork, String price) {
            this.atrName = atrName;
            this.hoursOfWork = hoursOfWork;
            this.price = price;
        }
        public void showInfo() {System.out.println("Аттракцион: " + atrName + "Время работы: " + hoursOfWork + "Стоимость: " + price);}
        public void showParkInfo(){ System.out.println("Парк: " + parkname);}
}

    public static void main(String[] args) {
        Park park = new Park("Disneyland");
        Park.Attractions attractions = park.new Attractions("Американские горки", "12:00 - 22:00", "1000");
        attractions.showParkInfo();
        attractions.showInfo();
    }
}
