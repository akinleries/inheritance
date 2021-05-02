package Inheritance2;

public class BaseVehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public BaseVehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle at" + currentDirection + " degrees");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println();
    }

}
