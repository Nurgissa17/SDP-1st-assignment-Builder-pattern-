public class Main{
    public static void main(String[] args){
        EmailObjectBuilder obj = new EmailObjectBuilder();
        EmailDirector director = new EmailDirector();
        director.welcomeEmail(obj);
        Email email = obj.getResult();
        director.reminderEmail(obj);
        Email r_email = obj.getResult();
        System.out.println("1st representation");
        System.out.println(email);
        System.out.println();
        System.out.println(r_email);
        System.out.println();

        EmailTextBuilder text = new EmailTextBuilder();
        director.welcomeEmail(text);
        String Etext = text.getResult();
        director.reminderEmail(text);
        String r_Etext = text.getResult();
        System.out.println("2nd representation");
        System.out.println(Etext);
        System.out.println();
        System.out.println(r_Etext);
    }
}