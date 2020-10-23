package abstract_factory_pattern;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Square");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Circle");
        shape3.draw();

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape4 = shapeFactory.getShape("Rectangle");
        shape4.draw();

        Shape shape5 = shapeFactory.getShape("Square");
        shape5.draw();

        Shape shape6 = shapeFactory.getShape("Circle");
        shape6.draw();
    }

}
