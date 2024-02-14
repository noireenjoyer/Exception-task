package Exception;

public class AirBalloon {
    private int height;

    public void setHeight(int height) throws HeightOutOfRangeException {
        if (height < 120 || height > 355) {
            throw new HeightOutOfRangeException("It is impossible to take readings outside the altitude range (120-355 meters).");
        }
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
