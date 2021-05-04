package VehicleApplication;

public class Toyota extends Car{
    private int roadServiceMonth;

    public Toyota(int roadServiceMonth) {
        super("camry", "4wd", 5, 5, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity == 0){
            stop();
            changeGear(1);
        }
        else if (newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }
        else if (newVelocity >10 && newVelocity <=20){
            changeGear(2);
        }
        else if (newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }else {
            changeGear(4);
        }
        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }
}
