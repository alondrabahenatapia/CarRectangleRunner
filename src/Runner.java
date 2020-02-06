public class Runner {
    public static void main(String[] args) {
        Car myCar = new Car(2020,"nissan",68000,"pathfinder");
        System.out.println(myCar.toString());
        myCar.drive(1000);
        System.out.println(myCar.toString());
        Rectangle myRectangle = new Rectangle(5,5);
        System.out.println(myRectangle.isSquare());
        Rectangle theRectangle = new Rectangle(7,3);
        System.out.println(theRectangle.isSquare());
    }




}
