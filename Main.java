import java.util.Scanner;
public class Main{ 
    public static void main(String[] args) {
       
     // Rectangle (Rectangle.java)

 Scanner rect= new Scanner(System.in);
 Rectangle r1= new Rectangle();

 System.out.println("Give the Height and Width of the rectangle" );
 System.out.print("Height: ");
double height = rect.nextDouble();
  r1.setHeight(height);
  System.out.print("Width: ");
double width = rect.nextDouble();
  r1.setWidth(width);

double area =r1.getHeight() * r1.getWidth();

   System.out.println("The area of the Rectangle is " + area);
   System.out.println("The height is " + r1.getHeight());
   System.out.println("The width is " + r1.getWidth());
   System.out.println("The area is " + area);
 
  rect.close();

System.out.println("  ");
System.out.println("  ");



  // User (User.java)

    User u1= new User("Aimen", "Aimen@gmail.com");
    User u2= new User("Youssef", "Youssef@gmail.com");
          
    System.out.println(u1);
    System.out.println(u2);
      u2 =u1;
    System.out.println( u1==u2);

System.out.println("  ");
System.out.println("  ");


  //Point  (Point.java)

    Point p= new Point(); 
    p.translate(5, 3); 
    p.afficher();

System.out.println("  ");
System.out.println("  ");

// Temperature (Temperature.java)

 Temperature t1 = new Temperature(25.0);
    try {
     System.out.println("Température valide : " + t1.getValue() + "°C");
      } catch (IllegalArgumentException e) {
       System.out.println("Température invalide !");
       }

System.out.println("  ");
System.out.println("  ");
 
// Generator (IdGenerator.java)

System.out.println(IdGenerator.nextId()); 
System.out.println(IdGenerator.nextId()); 
System.out.println(IdGenerator.nextId()); 
System.out.println(IdGenerator.nextId()); 


System.out.println("  ");
System.out.println("  ");
 
// MathUtil (MathUtil.java)


System.out.println(MathUtil.clamp(5, -3, 10));   
  System.out.println(MathUtil.clamp(-3, 3, 10));  
    System.out.println(MathUtil.clamp(20, 0, 10));  
     }


}
    