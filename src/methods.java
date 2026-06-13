public class methods {
    void sum(int a,int b){
        System.out.println(a+b);
        /*The method performs action but does not give a result back to main method */
    }
    static void sub(int a,int b){
        System.out.println(a-b);
         methods d=new methods();
        /*The method performs action and gives a result back to main method */
        d.sum(a,b);//we can call instance method inside static method but we have to create an object of the class to call the instance method
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
       // methods d=new methods();
        //d.sum(a,b);//instance method
        sub(a,b);//static method
    }
}
/*we can access static methods without creating an object of the class 
inside a static method we can can instance methods too*/