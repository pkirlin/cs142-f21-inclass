package lab4;

/** A CameraView represents the view from one of the three
 * cameras mounted on a self-driving car.
 */
public class CameraView {
    private char ground;
    private Car car;

    /** Construct a new CameraView. */
    public CameraView(char theRoad, Car theCar) {
        ground = theRoad;
        car = theCar;
    }

    /** Getter for road. */
    public char getGround() {
        return ground;
    }

    /** Getter for car. */
    public Car getCar() {
        return car;
    }
}
