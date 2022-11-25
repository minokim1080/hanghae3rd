public class Bus extends PublicTransport{
    private final int fare = 1000;

    public Bus() {
        super();
        maxPassenger = 30;
        state = "운행중";
    }

    @Override
    public void changeState() {
        if(gas<10){
            state = "차고지행";
            getState();
            System.out.println("주유 필요");
        }
        else if(state=="차고지행"){
            state = "운행중";
        }
        else{
            state = "차고지행";
        }
    }

    @Override
    public void getOn(int passengerNum) {
        if(state!="운행중"){
            System.out.println("운행중이 아닙니다.");
            return;
        }

        currentPassenger += passengerNum;
        if(currentPassenger < maxPassenger){
            remainingPassenger = (maxPassenger - currentPassenger);
            getCurrentPassenger();
            getRemainingPassenger();
            System.out.println("요금 확인 = " + (fare*passengerNum));
        }
        else{
            currentPassenger -= passengerNum;
            System.out.println("최대 승객 수 초과");
        }
    }
}
