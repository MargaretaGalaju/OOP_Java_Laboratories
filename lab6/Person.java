package OOP.lab6;

import java.time.LocalDate;

public class Person {
    private String title;
    private String givenName;
    private String familyName;
    private LocalDate birthDate;
    private enum Gender {
        MALE,
        FEMALE,
    }
    private String homeAddress;
    private String phone;

    private Hospital[] hospitalList;
}


