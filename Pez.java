
package animal;

public class Pez extends Animal implements Pet {
    public String name;
public Pez(){
super(0);
}    
 @Override
public String getName() {
        return name;
    }

@Override
public void setName(String name) {
        this.name = name;
    }

@Override
public void play(){
    System.out.println("nada en su pecera todos los dias");
}
@Override
public void eat(){
    System.out.println("los peces comen espuma en su pecera");
}   
}