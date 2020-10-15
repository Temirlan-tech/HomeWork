public final class Cat extends Pet {

    private Host host;

    public Cat(String name, int age, Color color, Host host) {
        super(name, age, color);
        this.host = host;
    }

    public Host getHost() {
        return host;
    }

    public String makeVoice(int num, String voice) {
        return super.makeVoice(num, voice) + Color.BLACK;
    }
    public String getInfo(){
        return super.getInfo() +
                "\nname = " + host.getName() +
                "\naddress = " + host.getAddress();
    }

}
