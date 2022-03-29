import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public int XXX(String s) {
        String result = "";
        try {
            s = s.trim();
            Pattern p =  Pattern.compile("^([0-9]+|[-+]{1}\\d+).*$");
            Matcher matcher = p.matcher(s);
            if (matcher.find()) {
                result = matcher.group(1);
            } else {
                return 0;
            }
            return Integer.parseInt(result);
        } catch (NumberFormatException nf) {
            return result.startsWith("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        } catch (IllegalStateException ie) {
            return 0;
        }
    }
}

