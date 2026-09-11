public interface EmailBuilder {
    EmailBuilder setTo(String to);
    EmailBuilder setSubject(String subject);
    EmailBuilder setBody(String body);
}
