import java.util.*;
abstract class shape{
abstract void numberofsides();

}

class rectangle extends shape{
void numberofsides(){
System.out.println("Rectangle:4 sides");
}

}

class triangle extends shape{
void numberofsides(){
System.out.println("Triangle:3 sides");
}
}
class hexagon extends shape{
void numberofsides(){
System.out.println("Hexagon:6 sides");
}
}

class Abstractclass{
public static void main(String arg[]){
rectangle a=new rectangle();
triangle b=new triangle();
hexagon c=new hexagon();
a.numberofsides();
b.numberofsides();
c.numberofsides();


}
}
