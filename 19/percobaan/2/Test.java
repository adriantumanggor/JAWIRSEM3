public class Test {
   public static void main(String[] args) {
      UsbFlash usb = new UsbFlash();
      Audio audio = new Audio();
      Car car = new Car();

      car.playMusic(usb);
      car.installAudio(audio);
      car.replaceWheel();
   }
}
