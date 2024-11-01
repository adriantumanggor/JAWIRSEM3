public class Fans {
    private String name;
    
    public Fans(){
        this.name = "NoName";
    }

    public Fans(String name){
        this.name = name;
    }

    public void showName(){
        System.out.print(name + " : ");
    }

    public void watchingPerformances(){
        showName();
        System.out.println("Melihat idolanya dari youtube");
    }

    public void watchingPerformances(Musician musician){
        showName();
        System.out.print("Melihat idolanya ");
        musician.perform();
    }
}
