 class Solution {
    public int XXX(String haystack, String needle) {
        if (needle.equals("")) return 0;
        if (needle.length() > haystack.length()) return -1;

        int index = -1;
        int len = haystack.length() - needle.length();
        for (int i = 0; i <= len; ++i) {
            String s = haystack.substring(i, i + needle.length());//按needle的长度剪裁haystack,使长度一致
            if (compare(i, s, needle)) {
                index = i;
                break;
            }
        }
        return index;
    }

    private boolean compare(int i, String s1, String s2) {
        int left = 0, right = s2.length() - 1;
        while (left <= right) {
            if (s1.charAt(left) == s2.charAt(left) && s1.charAt(right) == s2.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}

