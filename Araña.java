
package animal;

public class Araña extends Animal {
public Araña(){
  super(8);
}
@Override
public void eat(){
    System.out.println("este animal come insectos"+getLegs());
}
}
