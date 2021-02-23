public class PatientTest {
  public static void main(String[] args) {
    Patient[] patients = new Patient[3];
    patients[0] = new Patient("124521", "Ali Hassan", "0507454124",
        new Address("King Abdullah Road", "Riyadh", "Saudi Arabia"));
    patients[1] = new Patient("354624", "Salem Al-Salem", "0524798621",
        new Address("King Khaled Road", "Jeddah", "Saudi Arabia"));
    patients[2] = new Patient();

    patients[2].setID("541874");
    patients[2].setName("Mounir Hamdi");
    patients[2].setMobilePhone("0514214541");
    patients[2].setAddress(new Address("King Faisal Street", "Makkah", "Saudi Arabia"));
    for (int i = 0; i < patients.length; i++) {
      System.out.println(patients[i]);
    }
  }
}
