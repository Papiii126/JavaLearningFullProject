package rozdzial2.zajecia_dodatkowe4_streams.przyklady;

import java.util.List;

public class Emploee {
    private String name;
    private String surname;
    private int age;
    private List<String> skills;

    public Emploee(String name, String surname, int age, List<String> skills) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                '}';
    }
}

