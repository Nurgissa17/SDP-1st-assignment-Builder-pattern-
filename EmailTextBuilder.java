public class EmailTextBuilder implements EmailBuilder{
    private String to;
    private String subject;
    private String body;

    @Override
    public EmailTextBuilder setTo(String to){
        this.to = to;
        return this;
    }
    @Override
    public EmailTextBuilder setSubject(String subject){
        this.subject = subject;
        return this;
    }
    @Override
    public EmailTextBuilder setBody(String body){
        this.body = body;
        return this;
    }
    public String getResult(){
        if(to == null || subject == null || body == null){
            throw new IllegalStateException("The Email data is missing");
        }
        return "To: " + to + "\n subject: " + subject + "\n body: " + body;
    }
}
