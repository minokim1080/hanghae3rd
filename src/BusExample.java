public class BusExample {
    public static void main(String[] args) {
        Bus bus1 = new Bus();  //버스 생성
        Bus bus2 = new Bus();

        System.out.println(bus1.getCarNumber()== bus2.getCarNumber()); //버스 번호 비교

        bus1.getOn(2);

        bus1.setGas(-50);

        bus1.changeState();
        bus1.getState();

        bus1.setGas(10);

        bus1.changeState();
        bus1.getState();

        bus1.getOn(45);


        bus1.getOn(5);

        bus1.setGas(-55);

        bus1.getOff(2);

    }
}
