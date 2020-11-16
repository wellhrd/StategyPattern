
package strategypatterngame;

public class AlphaTheMagnetWorrior extends Characters {
    
    AlphaTheMagnetWorrior(){
        attackBehaviour = new JumpAndAttack();
        soundBehaviour = new Growl();
    }

    @Override
    public void displayAttackA() {
        System.out.println("\t Alpha, Lightning Blade Slash!");
    }

    @Override
    public void displayAttackB() {
        //No attack option 
    }
    
}
