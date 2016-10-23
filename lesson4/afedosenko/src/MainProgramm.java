import lessons.TrianglePascal;

public class MainProgramm {
  public static void main(String[] args) {
    System.out.println("--- Andrey Fedosenko. Homework. Lesson 4.");
    System.out.println("-- Part 1. Pascal`s triangle.");

    TrianglePascal tp = new TrianglePascal(10);
    tp.print();
    tp.print("EVEN");
    tp.print("ODD");
    tp.print("FILTER");

  }

}
