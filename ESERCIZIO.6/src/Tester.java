public class Tester {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape(2.2);
        Shape shape3 = new Shape(3.5, 4);
        Shape shape4 = new Shape(1.2, 3.5, 4);
        Shape shape5 = new Shape(3.4,3.4, 4.5, 3);

        System.out.println(shape1.getShapeDetails());
        System.out.println(shape2.getShapeDetails());
        System.out.println(shape3.getShapeDetails());
        System.out.println(shape4.getShapeDetails());
        System.out.println(shape5.getShapeDetails());


    }
}
