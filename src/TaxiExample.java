public class TaxiExample {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();

        System.out.println(taxi1.getCarNumber()== taxi2.getCarNumber()); //버스 번호 비교
        taxi1.getGas();
        taxi1.getState();

        taxi1.setDestination("서울역", 2);
        taxi1.getOn(2);

        taxi1.setGas(-80);
        taxi1.getCumulativeFare();

        taxi1.getOn(5);

        taxi1.setDestination("구로디지털단지역",12);
        taxi1.getOn(3);

        taxi1.setGas(-20);
        taxi1.getState();
        taxi1.getCumulativeFare();
    }
}
