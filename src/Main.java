/*Array is a datatype which help to store multiple values of same datatype in a single variable. 
It is a collection of similar type of data items which have a common name. 
Each item in an array is called an element and each element can be accessed by its index number. 
The index number starts from 0 to n-1 where n is the size of the array.*/



/*ArrayList = A resizeable array that store object 
            Arrays are fixed in size , but ArrayList can change its size
            
import java.util.ArrayList;
ArrayList<datatype> arraylist_name = new ArrayList<String>();
arraylist_name.add("value"); //adding value to arraylist
arraylist_name.get(index); //getting value from arraylist   
arraylist_name.remove(index); //removing value from arraylist
arraylist_name.size(); //getting the size of arraylist
arraylist_name.clear(); //removing all the elements from arraylist
arraylist_name.isEmpty(); //checking whether the arraylist is empty or not
arraylist_name.contains("value"); //checking whether the value is present in arraylist or not
arraylist_name.indexOf("value"); //getting the index of value in arraylist
arraylist_name.set(index, "value"); //updating the value at index in arraylist
*/







//datatype [] array_name = new datatype[size];
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public void arr(Scanner sc){
        int [] c=new int[5];
        System.out.println("Enter the elements of array");
        for(int i=0;i<5;i++){
            c[i]=sc.nextInt(); //initialization of array
        }
        c[3]=34; //updating the value of array
        System.out.println(Arrays.toString(c)); //printing the elements of array
    }
    public void multidimentionalArray(Scanner sc) {

    /*   int[][] d = {
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {4,5,6}
      };

    for (int i = 0; i < d.length; i++) {
        for (int j = 0; j < d[i].length; j++) {
            System.out.print(d[i][j] + " ");
        }
        System.out.println();

     }*/
         int[][] d = new int[3][];

        d[0] = new int[3];
        d[1] = new int[2];
        d[2] = new int[4];

        System.out.println("Enter the elements:");

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array is:");
/* 
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }*/
       for(int i=0;i<d.length;i++){
        System.out.println(Arrays.toString(d[i]));
       }    
    }  
        public static void main(String args[]){ 
            Main obj=new Main();
         //declaration and instantiation of array
int [] a={1,2,3,4,5}; //declaration and initialization of array in direct methd\od
int [] b=new int[10];
 Scanner sc=new Scanner(System.in);
 //System.out.println("Enter the elements of array");
/*  for(int i=0;i<10;i++){
     b[i]=sc.nextInt(); //ini
     // tialization of array
 }
*/
 //System.out.println("The elements of array are:"+ Arrays.toString(b));
 /*String [] str=new String[5];
 for(int i=0;i<5;i++){
     str[i]=sc.next(); //initialization of array
 }
//for(String s:str){
    System.out.println(Arrays.toString(str)); //printing the elements of array
//}*/
//obj.arr(sc);
obj.multidimentionalArray(sc);  
}
}