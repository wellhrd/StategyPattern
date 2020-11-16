
package strategypatterngame;

public class ElementalHeroNEOS extends Characters {
    
    ElementalHeroNEOS () {
        attackBehaviour = new JumpAndAttack(); //This suppose to run too...
        attackBehaviour = new FlyAndAttack();
        soundBehaviour = new Intimidate();
    }

    @Override
    public void displayAttackA() {
        System.out.println("\t 💪🏽 Karate Chop attack!");
    }
    
    @Override
    public void displayAttackB() {
        System.out.println("\t Firing beam... ⚡ ⚡ ⚡  ⚡ ");
    }
    
}
