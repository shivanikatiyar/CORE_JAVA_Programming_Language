/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Dell 3567 7i3
 */
//public class Covarient_return_type_Hackerrank_exam {
    
//}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
    String whatsYourName()
    {
        return "I have many names and type.";
    }
}
class Jasmine extends Flower{
    String whatsYourName()
    {
        return "Jasmine";
    }
}

class Lily extends Flower {
    String  whatsYourName()
    {
        return "Lily";
    }
}
class Region{
    Flower yourNationalFlower()
    {
        return new Flower();
    }
}

class WestBengal extends Region{
   Jasmine yourNationalFlower()
   {
       return new Jasmine();
   }
}

class AndhraPradesh extends Region {
    Lily yourNationalFlower()
    {
        return new Lily();
    }
}


public class Covarient_return_type_Hackerrank_exam {
  public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine().trim();
      Region region = null;
      switch (s) {
        case "WestBengal":              
          region = new WestBengal();
          break;
        case "AndhraPradesh":
          region = new AndhraPradesh();  // input->AndhraPradesh-->output-->Lily.
          break;
      }
      Flower flower = region.yourNationalFlower();
      System.out.println(flower.whatsYourName());
    }
}
