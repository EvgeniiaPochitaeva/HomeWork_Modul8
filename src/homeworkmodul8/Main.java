package homeworkmodul8;

public class Main  {
      public static void main(String[] args) {
          Circle circle = new Circle("Circle");
          System.out.println(circle.getName());
          Quad quad = new Quad("Quad");
          System.out.println(quad.getName());
          Triangular triangular = new  Triangular("Triangular");
          System.out.println(triangular.getName());
          Oval oval = new Oval("Oval");
          System.out.println(oval.getName());
          Pentagonal pentagonal = new Pentagonal("Pentagonal");
          System.out.println(pentagonal.getName());


    }
}