 class Solution {
    public String XXX(String[] strs) {
        // edge cases
        if (strs == null || strs.length == 0) return "";
        // divide and conque
        int n = strs.length;
        return help(strs, 0, n - 1);  
    }

    private String help(String[] strs, int i, int j) {
        if (i == j) {
            return strs[i];
        }

        int middle = (i + j) / 2;
        String left_prefix = help(strs, i, middle);
        String right_prefix = help(strs, middle + 1, j);
        StringBuilder result = new StringBuilder();
        int maxLength = Math.min(left_prefix.length(), right_prefix.length());
        for (int l = 0; l < maxLength; l++) {
            if (left_prefix.charAt(l) == right_prefix.charAt(l)) {
                result.append(left_prefix.charAt(l));
            } else {
                return result.toString();
            }
        }
        return result.toString();
    }
}

