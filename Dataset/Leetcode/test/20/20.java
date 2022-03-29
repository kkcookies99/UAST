 class Solution {
    public boolean XXX(String s) {
        while (s.contains("[]") || s.contains("{}") || s.contains("()")) {
            s = s.replace("[]", "").replace("{}", "").replace("()", "");
        }
        return s.length() == 0;
    }
}

