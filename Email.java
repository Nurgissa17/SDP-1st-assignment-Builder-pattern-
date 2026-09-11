public class Email {
    private final String to;
    private final String subject;
    private final String body;

    Email(String to, String subject, String body){
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public String toString(){
        return "To: " + to +
                "\nsubject: " + subject + "\nbody: " + body;
    }
}
