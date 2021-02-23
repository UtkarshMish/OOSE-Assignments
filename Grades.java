import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Grades {
  public static float max(ArrayList<Float> grades) {
    return Collections.max(grades);
  }

  public static float min(ArrayList<Float> grades) {
    return Collections.min(grades);
  }

  public static float average(ArrayList<Float> grades) {
    return grades.stream().reduce(0f, (a, b) -> a + b) / grades.size();
  }

  public static ArrayList<Float> remove_duplicates(ArrayList<Float> grades) {
    Set<Float> items = new HashSet<Float>();
    items.addAll(grades);
    ArrayList<Float> withoutDuplicates = new ArrayList<Float>();
    withoutDuplicates.addAll(items);
    return withoutDuplicates;
  }

  public static void main(String[] args) throws FileNotFoundException, IOException {
    String gradeFileName = "grades.txt";
    File gradeFile = new File(gradeFileName);
    Scanner filScanner = new Scanner(gradeFile);
    ArrayList<Float> gradeList = new ArrayList<Float>();
    while (filScanner.hasNext()) {
      float grade = Float.parseFloat(filScanner.nextLine());
      gradeList.add(grade);
    }
    filScanner.close();
    System.out.println("MAX: " + max(gradeList));
    System.out.println("MIN: " + min(gradeList));
    System.out.println("AVERAGE: " + average(gradeList));
    System.out.println("BEFORE REMOVAL OF DUPLICATES: " + gradeList);
    System.out.println("AFTER REMOVAL OF DUPLICATES: " + remove_duplicates(gradeList));
  }

}