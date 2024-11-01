public class Car {
    public Engine engine;
    public Wheel wheels;
    public Audio audio;
    
    public Car(){
        this.engine = new Engine();
    }

    public void replaceWheel(){
        this.wheels = new Wheel();
    }

    public void installAudio(Audio audio){
        this.audio = audio;
    }

    public void playMusic(UsbFlash usb){
        System.out.println("Playing music from USB");
    }
}
