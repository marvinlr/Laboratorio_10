
package animal;
/** @author marvin ledezma
 */
public class Gato extends Animal implements Pet{
private String name;
public Gato(){
this("callejero");
}
public Gato(String name){
super(4);
this.name=name;
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
    System.out.println("le gusta jugar con lana");
}
@Override
public void eat(){
    System.out.println("le gusta cazar aranas y rratones");
}
}
