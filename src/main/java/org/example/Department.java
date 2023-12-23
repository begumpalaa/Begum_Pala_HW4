package org.example;


import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmanAdi;
    private List<Personel> personeller;

    public Department(String departmanAdi) {
        this.departmanAdi = departmanAdi;
        this.personeller = new ArrayList<>();
    }

    public void addPersonel(Personel personel) {
        personeller.add(personel);
    }

    public List<Personel> getPersoneller() {
        return personeller;
    }

    public String getDepartmentName() {
        return departmanAdi;
    }

}
