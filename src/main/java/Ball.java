public class Ball{
    private int xCordinate;
    private int yCordinate;
    private int daimeter;
    private int speedRate;

    public Ball(int xCordinate, int yCordinate, int daimeter, int speedRate) {
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
        this.daimeter = daimeter;
        this.speedRate = speedRate;
    }

    public int getyCordinate() {
        return yCordinate;
    }

    public void setyCordinate(int yCordinate) {
        this.yCordinate = yCordinate;
    }

    public Ball() {
    }

    public int getSpeedRate() {
        return speedRate;
    }

    public void setSpeedRate(int speedRate) {
        this.speedRate = speedRate;
    }

    public int getDaimeter() {
        return daimeter;
    }

    public void setDaimeter(int daimeter) {
        this.daimeter = daimeter;
    }

    public int getxCordinate() {
        return xCordinate;
    }

    public void setxCordinate(int xCordinate) {
        this.xCordinate = xCordinate;
    }
}
