 class Solution {
    public String XXX(String a, String b) {
        StringBuilder result = new StringBuilder();
        int index = 1;
        int add = 0;
        int maxLength = Math.max(a.length(), b.length());
        while (index <= maxLength) {
            if (index <= a.length()) {
                add += (a.charAt(a.length() - index)) - 48;
            }
            if (index <= b.length()) {
                add += (b.charAt(b.length() - index)) - 48;
            }
            if (add <= 1) {
                result.insert(0, add);
                add = 0;
            } else {
                result.insert(0, add - 2);
                add = 1;
            }
            index++;
        }
        if (add != 0){
            result.insert(0, 1);
        }
        return result.toString();
    }
}

