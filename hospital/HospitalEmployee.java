package hospital;

public class HospitalEmployee extends Person {
  private String EmployeeID;

  public HospitalEmployee(String employeeID, String firstName, String lastName, Contact contact) {
    super(firstName, lastName, contact);
    if (employeeID.startsWith("EM") && employeeID.length() == 10) {
      EmployeeID = employeeID;
    } else
      throw new IllegalArgumentException("Employee ID should start with EM , and should be of length 10.");
  }

  @Override
  public String toString() {
    return String.format("%s\n%s\n", EmployeeID, super.toString());
  }
}
