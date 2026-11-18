package exceptionHandling.creatingexception.voterid;

public class VoterIDException extends Exception {

    VoterIDException() {
    }

    VoterIDException(String msg) {
        super(msg);
    }
}