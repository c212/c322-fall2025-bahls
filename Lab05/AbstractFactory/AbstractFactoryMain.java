public class AbstractFactoryMain{
    private static FurnitureFactory factory;

    public AbstractFactoryMain(FurnitureFactory factory){
        this.factory = factory;
    }

    public void createFurniture(){
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        chair.sitOn();
        sofa.relaxOn();
    }

    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();
        Chair chair = furnitureFactory.createChair();
        chair.sitOn();
        Sofa sofa = furnitureFactory.createSofa();
        sofa.relaxOn();

        AbstractFactoryMain clientOne = new AbstractFactoryMain(new VictorianFurnitureFactory());
        clientOne.createFurniture();

        AbstractFactoryMain clientTwo = new AbstractFactoryMain(new ModernFurnitureFactory());
        clientTwo.createFurniture();

        clientOne.createFurniture();

    }
}