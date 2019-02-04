public class Runner {
    public static void main(String[] args) {
        Car abby = new Car(2002, "BMW", "wow");
        System.out.println(abby.toString());
        abby.drive(100);
        System.out.println(abby.toString());

        Rectangle abb = new Rectangle(10,9);
        System.out.println(abb.getArea());
        System.out.println(abb.getDiagonal());
        System.out.println(abb.isSquare());
    }
}
