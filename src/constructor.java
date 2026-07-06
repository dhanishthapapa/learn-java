public class constructor {
    String name ;
    int rollnumber;
    constructor(String name,int rollnumber){
        this.name=name;
        this.rollnumber=rollnumber;
    }   
    void display (){
        System.out.println("name: "+name);
        System.out.println("roll number: "+rollnumber);
    }
    static void look(constructor c){// stat9ic method can be called without creating object of class
       //because the values are stored in the object c which is passed as argument to the method look
        System.out.println("name: "+c.name);
        System.out.println("roll number: "+c.rollnumber);
    }
    public static void main(String []args){
        
        constructor c=new constructor("john",123);
        constructor.look(c);
        c.display();
    }
}
/*             Arguments
("John",123)
      │
      ▼
Constructor receives them
      │
      ▼
Stores them in object
      │
      ▼
display() reads from object
      │
      ▼
Output */