public abstract class PublicTransport {
    protected static int count = 0;
    protected int carNumber;
    protected int gas=100;
    protected int speed=0;
    protected int fare;
    protected String state;
    protected String location; //현재 위치
    protected int maxPassenger;
    protected int currentPassenger = 0; //현재 승객 수
    protected int cumulativeFare = 0; //누적 요금
    protected int remainingPassenger;

    public PublicTransport(){
        count +=1;
        carNumber = count;
    }

    public int getCarNumber(){
        System.out.println("차 번호: " + carNumber);
        return carNumber;
    }

    public void drive(int passengerNum, String destination, int distance){}

    public int getCurrentPassenger(){
        System.out.println("탑승 승객 수 = " + currentPassenger);
        return currentPassenger;
    }

    public int getCumulativeFare(){
        System.out.println("누적 요금 = " + cumulativeFare);
        return cumulativeFare;
    }

    public int getRemainingPassenger(){
        System.out.println("잔여 승객 수 = " + remainingPassenger);
        return remainingPassenger;
    }

    public void setGas(int gas){
        this.gas += gas;
        getGas();
        if(this.gas<10){
            changeState();
        }
    }

    public void getGas(){
        System.out.println("주유량 = " + gas);
    }

    public void changeSpeed(int speed){
        if(gas>10){
            this.speed += speed;
            System.out.printf("속도가 %s로 바뀌었습니다.%n", this.speed);
        }
        else{
            System.out.println("주유량을 확인해 주세요.");
        }
    }

    public String getState(){
        System.out.println("상태 = " + state);
        return state;
    }

    public abstract void changeState();

    public abstract void getOn(int passengerNum);

    public void getOff(int passengerNum){
        currentPassenger -= passengerNum;
    }



}
