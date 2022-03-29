 class Solution {
    public String XXX(String[] strs) {
        if (strs.length == 0)
            return "";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            if (i == strs[0].length())
                return sb.toString();
            char c = strs[0].charAt(i);
            for (String str : strs) {
                if (i == str.length() || c != str.charAt(i))
                    return sb.toString();                    
            }
            sb.append(c);
            i++;
        }
    }
}

