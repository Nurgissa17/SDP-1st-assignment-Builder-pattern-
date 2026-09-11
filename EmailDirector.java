public class EmailDirector {
    private static final String user_email = "student_Nurgissa@gmail.com";
    private static final String welcome_s = "Welcome, Student!";
    private static final String welcome_b = "Welcome to our Email service";
    private static final String reminder_s = "Reminder";
    private static final String reminder_b = "Don't forget to complete your assignments!";
    public void welcomeEmail(EmailBuilder Builder){
        Builder
                .setTo(user_email).setSubject(welcome_s).setBody(welcome_b);
    }
    public void reminderEmail(EmailBuilder Builder){
        Builder
                .setTo(user_email).setSubject(reminder_s).setBody(reminder_b);
    }

}
