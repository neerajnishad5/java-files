public class FindUsernameFromEmail {
    public static void main(String[] args) {
        String email = "johncena@hotmail.com";

        int i = email.indexOf('@');

        String username = new String(email.substring(0, i));
        String domain = new String(email.substring(i + 1));
        System.out.println("Username: " + username + " " + "\nDomain: " + domain);

        System.out.println(domain.startsWith("gmail.com"));
        // System.out.println(email.matches("(.*)@gmail.*"));

    }
}
