public class FindTypeOfWebsite {
    public static void main(String[] args) {

        String s0 = new String("https://google.com");

        String protocol = s0.substring(0, s0.indexOf(":"));

        if (protocol == "https")
            System.out.println("HYPERTEXT TRANSFER PROTOCOL");
        else if (protocol == "ftp")
            System.out.println("FILE TRANSFER LANGUAGE");

        String type = s0.substring(s0.lastIndexOf("."));

        if (type.equals("com"))
            System.out.println("Type: Commercial");
        else if (type.equals("org"))
            System.out.println("Type: Organization");
        else if (type.equals("net"))
            System.out.println("Type: Network");
        else if (type.equals("in"))
            System.out.println("Type: India");

    }

}