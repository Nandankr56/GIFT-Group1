There are 3 types of members in a class:
1)  Field/Variable member
    int i = 10;
    String name = "Gandhi";
    char c = 'a';
    float f = 25.5f;
2)  Constructor member
    There may be n numbers of constructors, but the constructor name must
    resemble with the class name.
3)  Method/Function members
    There may be n numbers of methods.
    When 2 methods have same name, they are called overloading of methods.

Example:
    Compute.java
    ------------
    public class Compute {
        // Field members
        String name = "Narendra Modi";
        char gender = 'M';
        int age = 70;

        // Constructor members
        public Compute() {
        }

        public Compute(String name, char gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        //  Mehtod members
        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
        
    }

    In a public class, the name of the file in which the program/class is written
    must resemble the class name.

