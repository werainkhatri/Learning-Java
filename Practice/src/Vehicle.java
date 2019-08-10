public class Vehicle {
    private String name;
    private String type;
    private int size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String type, int size) {
        this.type = type;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection = direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

     public void gear(int gear) {

     }

     public void move(int velocity, int direction) {
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
     }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
