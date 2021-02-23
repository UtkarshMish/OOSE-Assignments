package hospital;

import java.util.ArrayList;

public class Patient extends Person {
  private String patientID;
  private ArrayList<MedicalReport> reports;

  public Patient(String patientID, String firstName, String lastName, Contact contact) {
    super(firstName, lastName, contact);
    if (patientID.startsWith("PA") && patientID.length() == 10)
      this.patientID = patientID;
    else
      throw new IllegalArgumentException("Patient ID should start with PA, and should be of length 10.");
  }

  @Override
  public String toString() {
    return String.format("[%s] %s %s", patientID, super.toString(), reports);
  }
}
