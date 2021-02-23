public class Patient {
  private String name;
  private Address address;
  private String ID;
  private String MobilePhone;

  public Patient() {
    this("000000", "0", "0", new Address("0", "0", "0"));
  }

  public Patient(String ID, String name, String MobilePhone, Address address) {
    this.ID = ID;
    this.name = name;
    this.MobilePhone = MobilePhone;
    this.address = address;
  }

  public Patient(Patient p) {
    this(p.getID(), p.getName(), p.getMobilePhone(), p.getAddress());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    if (ID.length() == 6)
      this.ID = ID;
    else
      throw new IllegalArgumentException("ID should be 6 Digits.");
  }

  public String getMobilePhone() {
    return MobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    if (mobilePhone.startsWith("05") && mobilePhone.length() == 10)
      MobilePhone = mobilePhone;
    else
      throw new IllegalArgumentException("Mobile phone should have 10 digits and start with 05.");
  }

  @Override
  public String toString() {
    return String.format("[%s]: %s, %s, {%s, %s, %s}", ID, name, MobilePhone, address.getStreetName(),
        address.getCity(), address.getCountry());
  }
}
