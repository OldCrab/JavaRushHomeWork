package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human {
        String name;
        int age;
        int weight;
        boolean sex;
        int height;
        String maritalStatus;

        public Human(String name) {
            this.name = name;
        }

        public Human() {

            this.name = "Empty";
        }
        public Human(String name, int age) {
            this.age = age;
            this.name = name;
        }
        public Human(String name, int age, int weight) {
            this.age = age;
            this.name = name;
            this.weight = weight;
        }
        public Human(String name, int age, int weight, boolean sex) {
            this.age = age;
            this.name = name;
            this.weight = weight;
            this.sex =sex;
        }
        public Human(String name, int age, int weight, boolean sex, int height) {
            this.height = height;
            this.age = age;
            this.name = name;
            this.weight = weight;
            this.sex =sex;
        }
        public Human(String name, int age, int weight, boolean sex, int height, String maritalStatus) {
            this.maritalStatus = maritalStatus;
            this.height = height;
            this.age = age;
            this.name = name;
            this.weight = weight;
            this.sex =sex;
        }
        public Human(String name, boolean sex, int height, String maritalStatus) {
            this.maritalStatus = maritalStatus;
            this.height = height;
            this.name = name;
            this.sex =sex;
        }
        public Human(String name, int age, int weight, boolean sex,  String maritalStatus) {
            this.maritalStatus = maritalStatus;
            this.age = age;
            this.name = name;
            this.weight = weight;
            this.sex =sex;
        }
        public Human(String name, boolean sex, String maritalStatus) {
            this.maritalStatus = maritalStatus;
            this.name = name;
            this.sex =sex;
        }

    }
}
