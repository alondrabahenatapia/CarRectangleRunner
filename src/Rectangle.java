public class Rectangle {
    private  double length;
    private  double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        double area = length * width;
        return area;
    }

    public double getDiagonal(){
        double diagonal = Math.sqrt((length * length) + (width * width));
        return diagonal;
    }
    public String square(){
        String square= "not a";
        if(length == width){
             square = "a";
        }

        return square;
    }

    public String isSquare() {
        return
                "This is a rectangle with a length of  " +
                        this.length+ " and a width of " +
                        this.width + " it's area is " +
                        this.getArea() + " and it's diagonal line measures" +
                        this.getDiagonal() + " and it is " +
                        this.square() + " square.";
    }




}
/*--------------------
|     RECTANGLE    |   ← class name
-------------------
| double length        |   ← properties
| double width          |
---------------------------
| getLength()           |   ← methods
| getWidth()             |
| setLength(double)|
| setWidth(double)  |
| getArea()              |
|getDiagonal()       |
| isSquare()            |
---------------------------*/
