// ShapeTester
import java.io.*;
import java.util.*;
public class ShapeTester{
 //---------------------------------------------------------------------------
 // Read the dimensions of various 3-D shapes from an input file, then
 // displays pertinent information about each shape.
 //---------------------------------------------------------------------------
 public static void main (String[] args){
 try
 {
 Scanner scan = new Scanner (new File("shapes.dat"));
 double  height, side;
 // double width, length, height, side, radius;
 // Read the data from the input file
 while (scan.hasNext())
 {
 String shapeType = scan.next();
 if (shapeType.equalsIgnoreCase("tetrahedron"))
 {
 side = scan.nextDouble();
 height = scan.nextDouble();
 System.out.println (new Tetrahedron (side, height));
 }
 }
 }

 catch (Exception except)
 {
 System.err.println(except);
 }
 }
}

// Shape


//(*) The contents of shapes.dat is: tetrahedron 4 5. 

