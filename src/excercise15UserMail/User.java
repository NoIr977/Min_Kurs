package excercise15UserMail;

public class User {

    private String[] emails = new String[4];

    public User(String firstMail) {
        emails[0] = firstMail;
    }

    public boolean addEmail(String email) {
        for (int i = 0; i < emails.length; i++) {
            if (emails[i] == null) {
                emails[i] = email;
                return true;
            }
        }
        return false; //ingen plats för nya email finns
    }

    public String getEmail(int index) {
        if (index >= 0 && index < emails.length) {
            return emails[index];
        }
        return null;
    }
}
