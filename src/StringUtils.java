public class StringUtils {
    /**
     * combineStrings -- a + b
     * Concatenate String a to String b 
     * Ex: a = "Hello ", b = "World!", returns "Hello World!"
     */
    public static String combineStrings(String a, String b) {
        String res = a + b;
        return res;
    }

    /**
     * makePurdueUsername -- 7-letter-long lowercase username creator
     * Usernames may be at most 7 letters in length, and should
     * consist of the first letter of one's first name, and the 
     * amount of their last name that will fit into the remaining
     * 6 characters. All should be lowercase.
     * Ex: a = "Sean ", b = "Flannery", returns "sflanner"
     */
    public static String makePurdueUsername(String firstName, String lastName) {
        String res = combineStrings(firstName.substring(0,1), lastName);
        res.substring(0, 7);
        res.toLowerCase();
        return res;
    }

    /**
     * redactStudentUsername -- replace student usernames in sensitive text
     * We want to make sure student information is redacted from sensitive
     * documents as much as possible. 
     * Ex: text = "jframes was among the students whose SSNs were leaked.",
     * username = "[REDACTED] was among the students whose SSNs were leaked.",
     */
    public static String redactStudentUsername(String text, String username) {
        return text.replace(username, "[REDACTED]");
    }
}