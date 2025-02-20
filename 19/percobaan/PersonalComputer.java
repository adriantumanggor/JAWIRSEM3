public class PersonalComputer {
    private MotherBoard motherBoard;
    private OperatingSystem os;

    private Mouse mouse;

    public PersonalComputer(){
        this.motherBoard = new MotherBoard();
    }

    public void installOS(){
        this.os = new OperatingSystem();
    }
    
    public void readData (CompactDisk cd){
        //cd.read();
    }

    public void detectMouse(Mouse mouse){
        this.mouse = mouse;
    }
}