package rozdzial2.zajecia6.lombok;

import java.lang.module.ModuleDescriptor;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //TODO ogarnać lomboka jak bedziemy mieć InteliJa ultimate
        Student s1 = new Student("Patryk", "Wieso");
        s1.setName("Alek");
        System.out.println(s1);
        Student s2 = new Student("Tomasz", "Wieso");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }


    public static Student returnStudent(String imie, String nazwisko) {
        return Student.builder()
                .name(imie)
                .sureName(nazwisko)
                .build();
    }
}

//    Student.StudentBuilder builder = new Student.StudentBuilder();
//    builder
//            .name("Tomasz")
//            .sureName("Tobiasz")
//            .build();
//        System.out.println(builder);
















