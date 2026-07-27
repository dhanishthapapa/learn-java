package collection.list;
import java.util.ArrayList;
import java.util.Scanner; 
/*ArrayList automatically increases or decreases its size.
that stores multiple objects in a dynamic array.

syntax
ArrayList<DataType> list = new ArrayList<>();*/
class Animal{
    String anim_name;
    String type;
    int count;

}
public class ArrayListDome {
    ArrayList<Animal> setdata(Scanner sc){
     ArrayList<Animal> list = new ArrayList<>();
     Animal a=new Animal();
     a.anim_name=sc.nextLine();
     a.type=sc.nextLine();
     a.count=sc.nextInt();
     list.add(a);
     return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayListDome obj=new ArrayListDome();
        ArrayList<Animal> list = obj.setdata(sc);
         for (Animal a : list) {
            System.out.println("Animal Name : " + a.anim_name);
            System.out.println("Type        : " + a.type);
            System.out.println("Count       : " + a.count);
            System.out.println();
        }
    }
}
