
package animal;

public abstract class Animal {
 protected int legs;
 protected Animal(int legs){
   this.legs=legs;  
 }

    public int getLegs() {
        return legs;
        
    }
 
 public String walk(){
     return "este animal camina en "+getLegs()+" patas";
 }
 public abstract void eat();
}
