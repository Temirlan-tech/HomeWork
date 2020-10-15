public class Main {

    public static void main(String[] args) {
        Host host = new Host("Бишкек", "Асанбай");

        Pet objectA = new Pet("Джери", 1, Color.GRAY);

        Cat objectB = new Cat("Мурка", 5, Color.WHITE, host);

        Cat objectC = new Cat("Том", 2, Color.BLACK, host);

        System.out.println(objectA.getInfo());

        objectA.makeVoice("мяу", 2);
        System.out.println("_______________________________");

        System.out.println(objectB.getInfo());
        objectB.makeVoice("мяу");

        System.out.println("_______________________________");
        System.out.println(objectC.getInfo());

        objectC.makeVoice(4, "Мяу");
    }


}
