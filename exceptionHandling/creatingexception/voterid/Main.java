package exceptionHandling.creatingexception.voterid;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(22, "yashu");

        p.disp();

        try {
            p.checkEli(p.age);
        }
        catch (VoterIDException e) {
            System.out.println(e.getMessage());
        }
    }
}