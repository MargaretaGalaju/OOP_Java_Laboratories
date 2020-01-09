package OOP.lab6;

import java.time.LocalDate;

public class Patient extends Person {
    private int id;
    private LocalDate accepted;
    private String sickness;
    private String[] prescriptions;
    private String[] allergies;
    private String specialReqs;
}
