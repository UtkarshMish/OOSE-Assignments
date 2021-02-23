package hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends HospitalEmployee {
  public static final ArrayList<String> DEPARTMENTS_LIST = new ArrayList<String>(
      List.of("General", "Pediatric", "Internal Medicine"));
  private String department;

  public Doctor(String employeeID, String firstName, String lastName, Contact contact, String department) {
    super(employeeID, firstName, lastName, contact);
    if (employeeID.endsWith("D") && employeeID.length() == 10)
      if (DEPARTMENTS_LIST.contains(department))
        this.department = department;
      else
        throw new IllegalArgumentException("Department not present in Department List !");
    else
      throw new IllegalArgumentException("Employee id should end with D, and should have total length of 10.");

  }

  @Override
  public String toString() {
    return String.format("%s Department: %s", super.toString(), department);
  }
}
