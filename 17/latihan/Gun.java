// Gun class implementation
public class Gun extends Weapon {
    private int bullets;
    
    public Gun(int bullets) {
        this.bullets = bullets;
    }
    
    @Override
    public void attack() {
        if (bullets > 0) {
            System.out.println("Gun is shooting!");
            bullets--;
        } else {
            System.out.println("Out of bullets!");
        }
    }
}
