
package animal;
     //6
public class TestAnimal {
 public static void main(String[]args){
     Pez p=new Pez();
     Gato g=new Gato("silvestre");
     Animal a1=new Pez();
     Animal a2=new Araña();
     Pet mascota=new Gato();
     //7
     p.play();
     g.play();
     ((Pez)a1).play();
     mascota.play();
     //8 y 9
     p.eat();
     System.out.println(p.walk());
     g.eat();
     System.out.println(g.walk());
     a1.eat();
     System.out.println(a1.walk());
     a2.eat();
     System.out.println(a2.walk());
     ((Gato)mascota).eat();
     System.out.println(((Gato)mascota).walk());
 }   
}
