public class EmailObjectBuilder implements EmailBuilder{
    private String to;
    private String subject;
    private String body;

    public EmailObjectBuilder setTo(String to){
        this.to = to;
        return this;
    }
    public EmailObjectBuilder setSubject(String subject){
        this.subject = subject;
        return this;
    }
    public EmailObjectBuilder setBody(String body){
        this.body = body;
        return this;
    }
    public Email getResult(){
        if(to == null || subject == null || body == null){
            throw new IllegalStateException("The Email data is missing");
        }
        return new Email(to, subject, body);
    }
}