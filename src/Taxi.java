public class Taxi extends PublicTransport {
    private final int fare = 3000;
    private final int farePerDistance = 1000;
    private final int baseDistance = 1; //기본 거리
    public String destination;
    public int distance;



    public Taxi(){
        super();
        maxPassenger = 4;
        state = "일반";
    }

    @Override
    public void drive(int passengerNum, String destination, int distance) {
        int distanceOver = Math.max(distance-1,baseDistance);
        location = destination;
        int currentFare = fare + (distanceOver*farePerDistance);
        getCurrentPassenger();
        getRemainingPassenger();
        System.out.println("기본 요금 확인 = " + fare);
        System.out.println("목적지 = " + destination);
        System.out.printf("목적지까지 거리 = %skm%n", distance);
        System.out.println("지불할 요금 = " + currentFare);
        getState();
        payFare(currentFare);
        getOff(passengerNum);
        remainingPassenger = 0;
        changeState();
    }

    @Override
    public void changeState() {
        if(gas<10){
            state = "운행불가";
            System.out.println("주유 필요");
        }
        else if(currentPassenger>0){
            state = "운행중";
        }
        else{
            state ="일반";
        }
    }

    @Override
    public void getOn(int passengerNum){
        if(state=="운행중"){
            System.out.println("이미 탑승한 승객이 있습니다");
            return;
        }
        if(state=="운행불가"){
            System.out.println("주유 필요");
            return;
        }

        currentPassenger += passengerNum;
        if(currentPassenger<maxPassenger){
            remainingPassenger = (maxPassenger - currentPassenger);
            changeState();
            drive(currentPassenger, destination, distance);
        }
        else {
            currentPassenger -= passengerNum;
            System.out.println("최대 승객 수 초과");
        }
    }

    private void payFare(int fare){
        cumulativeFare += fare;
    }

    public void setDestination(String destination, int distance){
        this.destination = destination;
        this.distance = distance;
    }
}
