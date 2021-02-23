package hospital;

public class HospitalTest {
  public static void main(String[] args) {
    Patient aPatient = new Patient("PA12345678", "Mohamed", "Ahmed",
        new Contact(new Address(new Street(10, "Olya Street", "Morsalat Quarter"), "Riyadh", "Saudi Arabia"),
            new Phone("966", "05", "47896511"), new Phone("966", "011", "49173511")));
    Doctor aDoctor = new Doctor("EM1245785D", "Ahmed", "Nassir",
        new Contact(new Address(new Street(20, "Sfax Street", "Izdihar Quarter"), "Riyadh", "Saudi Arabia"),
            new Phone("966", "05", "47898711"), new Phone("966", "011", "4774131")),
        Doctor.DEPARTMENTS_LIST.get(0));
    System.out.printf("%s %s\n", aPatient, aDoctor);
  }
}