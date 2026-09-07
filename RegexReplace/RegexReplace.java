public class RegexReplace {
    public static String removeUnits(String s) {
       return  s.replaceAll("([0-9]+)(cm|€) " ,"$1 ");
    }
    
     public static String obfuscateEmail(String s) {

        String[] parts = s.split("@");

        String username = parts[0];
        String domain = parts[1];

        if (username.matches(".*[-._].*")) {
            username = username.replaceAll("(?<=[-._]).", "*");
        } else if (username.length() > 3) {
            username = username.substring(0, 3)  + "*".repeat(username.length() - 3);
        }

        String[] domains = domain.split("\\.");

        if (domains.length == 3) {
            domains[0] = domains[0].replaceAll(".", "*");
            domains[2] = domains[2].replaceAll(".", "*");
        } else if (domains.length == 2) {
            if (domains[1].equals("com")|| domains[1].equals("org")|| domains[1].equals("net")) {
                domains[0] = domains[0].replaceAll(".", "*");
            } else {
                domains[0] = domains[0].replaceAll(".", "*");
                domains[1] = domains[1].replaceAll(".", "*");
            }
        }

        domain = String.join(".", domains);

        return username + "@" + domain;
    }
}
