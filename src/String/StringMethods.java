package String;

public class StringMethods {
    public void substring() {
        String email = "programmer@sgmail.com";
        String gmail = "gmail";
        int i = email.indexOf("@");
        int j = email.indexOf('.', i);
        String val = email.substring(i+1, j);
        int ans = gmail.compareTo(val);
        System.out.println(ans);
    }

    public void regex() {
        // Check if the number is binary or not
        int i = 10110001;
        String str = i+"";
        System.out.println(str.matches("[01]*"));

        // Check if hexadecimal or not
        String hex = "87978AB";
        System.out.println(hex.matches("[0-9A-F]+"));

        // Check date format
        String date = "20/09/2025";
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));

        // Remove Special characters from String
        String special = "a!b@C#1%2^3";
        String ans = special.replaceAll("\\W","");
        System.out.println(ans);

        // Remove extra spaces from string
        String space = "            abc                hui          j             madknf          adokfmweq          fasoknmwmokfw";
        String spaces = space.replaceAll("\\s+"," ").trim();
        System.out.println(spaces);

        // Find number of words in the String
        String str3  = "            abc                hui          j             madknf          adokfmweq          fasoknmwmokfw";
        int count = 0;
        String word = str3.replaceAll("\\s+"," ").trim();
        String words[] = word.split("\\s");
        System.out.println(words.length);

    }
}
