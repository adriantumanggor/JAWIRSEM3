public class KpopFans extends Fans {
    public KpopFans(){
        super("NoName");
    }

    public KpopFans(String name){
        super(name);
    }

    public void watchingPerformances(Musician musician, String Expression){
        showName();
        System.out.print(Expression + " Melihat idolanya");
        musician.perform();
    }
}
