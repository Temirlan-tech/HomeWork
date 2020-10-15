public class Pet extends Animal {

    private Color color;

    public Pet(String name, int age, Color color) {
        super(name, age);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    public String makeVoice(int num, String voice) {
        for (int i = 0; i < num; i++) {
            System.out.println(voice);
        }
        return voice;

    }

    public String makeVoice(String voice, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(voice);
        }
        return voice;

    }

    @Override
    public String getInfo() {
        return super.getInfo() +

                "\ncolor = "+ getColor();
    }
}
