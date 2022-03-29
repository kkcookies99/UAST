 class Solution {
    public boolean XXX(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        return usingTwoPointer(s);
        // return usingStringBuffer(s);
    }

    public boolean usingStringBuffer(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }

    private boolean usingTwoPointer(String s) {
        int n = s.length();
        int a = 0, b = n - 1;
        while (a < b) {
            while (a < b && !Character.isLetterOrDigit(s.charAt(a))) {
                a++;
            }
            while (a < b && !Character.isLetterOrDigit(s.charAt(b))) {
                b--;
            }
            if (Character.toLowerCase(s.charAt(a)) != Character.toLowerCase(s.charAt(b))) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}

