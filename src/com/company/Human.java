package com.company;

public class Human {

    private String name;
    private Boolean gender;
    private int age;
    private Human father;
    private Human mother;

    public Human(String name, Boolean gender, int age, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, Boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Boolean getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    @Override
    public String toString() {
        String txt = "";
        if(father != null)
            txt += ", отец: " + this.father.name;
        if (this.mother != null)
            txt += ", мать: " + this.mother.name;

        return "Имя: " + name + ", Пол: " + (gender ? "мужской" : "женский")  + ", возраст: " + age + txt;

    }
}
