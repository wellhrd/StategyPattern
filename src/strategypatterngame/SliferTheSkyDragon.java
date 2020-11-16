
package strategypatterngame;

public class SliferTheSkyDragon extends Characters{
    
    SliferTheSkyDragon () {
        attackBehaviour = new FlyAndAttack();
        soundBehaviour = new Growl();
    }

    @Override
    public void displayAttackA() {
        System.out.println("\t 🌌 🌠 Thunderforce attack!");
    }

    @Override
    public void displayAttackB() {
        System.out.println("\t 🌀 Dragon Whip Blast...🔥");
    }
    
}
