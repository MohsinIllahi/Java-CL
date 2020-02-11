public class Example{
public static void main(String args[]){
int tech = 2;
int course = 2; 
 //new thing I learned that two switch can be placed in one program
switch(tech){
case 1:
      System.out.println("python");
      break;
case 2: 
      switch(course){
      case 1:
             System.out.println("C++");
             break;
      case 2:
            System.out.println("java");
             }
  }
}
}      