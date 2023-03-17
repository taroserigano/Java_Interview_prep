/* Online Java Compiler and Editor */
import java.util.*;

public class myCON{
  
  
int modelYear;
    String modelName;


    public myCON(int year, String name){
        this.modelYear = year;
        this.modelName = name;
    }
    

     public static void main(String []args){
myCON myObj[] = {new myCON(2005, "Nissan5"), new myCON(2006, "Nissan6")};
for(int i=0; i<myObj.length;i++){
   System.out.println(myObj[i].modelYear + " " + myObj[i].modelName);
}
List<myCON> myObj2 = new ArrayList<>();
for(int i=0; i<5; i++) {
   myObj2.add(new myCON(2005, "Nisan5"));
}
for(int i=0; i<5; i++) {
   System.out.println(myObj2.get(i).modelYear + " " + myObj2.get(i).modelName);
}

     }
}
