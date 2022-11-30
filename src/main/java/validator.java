import java.util.regex.Pattern;

public class validator {


    private static final String regex = "^[a-zA-Z0-9]+$";
    public static boolean validateUserName(String name) {
        if (name.length() < 6 || name.length() > 12) return false;
        return Pattern.compile(regex).matcher(name).matches();
    }
}