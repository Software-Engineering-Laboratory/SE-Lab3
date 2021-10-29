public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) throws IllegalArgumentException {
        if (width <= 0){
            throw new IllegalArgumentException("Width should be positive!");
        }
        if (height <= 0){
            throw new IllegalArgumentException("Height should be positive!");
        }
        this.width = width;
        this.height = height;
    }

    public int computeArea(){
        return width * height;
    }
}
