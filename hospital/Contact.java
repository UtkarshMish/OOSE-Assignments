/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

public class Contact {
    
    private Address address;
    private Phone mobilePhone;
    private Phone homePhone;

    public Contact(Address address, Phone mobilePhone, Phone homePhone) {
        this.address = address;
        this.mobilePhone = mobilePhone;
        this.homePhone = homePhone;
    }
    
    

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Phone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Phone getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(Phone homePhone) {
        this.homePhone = homePhone;
    }

    @Override
    public String toString() {
       return String.format("Address: %s\n Mobile: %s, Home: %s", this.address, this.mobilePhone, this.homePhone);
    }

}
