
package strategypatterngame;

//Abstract inherits from previously created classes
public abstract class Characters {
    AttackBehaviour attackBehaviour;
    SoundBehaviour soundBehaviour;
    
    
    //Children have their unique display method
    public abstract void displayAttackA();
    
    public abstract void displayAttackB();
    
    //Character features / behaviours
    public void performAttack(){
        attackBehaviour.attack();
       
    }
    
    public void performSound() {
        soundBehaviour.soundType();
    }
    
    
}
