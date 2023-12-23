package org.example;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){

        Department argeDepartment = new Department("Arge Departmanı");

        Personel personel1 = new Personel("Begüm", "Pala");
        Personel personel2 = new Personel("Elif", "Test");

        argeDepartment.addPersonel(personel1);
        argeDepartment.addPersonel(personel2);

        List<Personel> departmentPersonelleri = argeDepartment.getPersoneller();
        System.out.println(argeDepartment.getDepartmentName() + " Departmanındaki Personeller:");
        for (Personel personel : departmentPersonelleri) {
            System.out.println(personel);
        }
    }

}