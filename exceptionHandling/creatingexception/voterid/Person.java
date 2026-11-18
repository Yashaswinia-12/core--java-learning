package exceptionHandling.creatingexception.voterid;

public class Person {
    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void disp() {
        System.out.println("Age = " + age);
        System.out.println("Name = " + name);
    }

    void checkEli(int age) throws VoterIDException {
        if (age >= 18) {
            System.out.println("Eligible for Voter ID");
        } else {
            throw new VoterIDException("Not eligible for Voter ID");
        }
    }
}