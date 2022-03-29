 class Solution {
    public boolean XXX(String s) {
        if (s == null || s.equals(""))
            return true;
        int start = 0, end = s.length() - 1;
        char[] ch = s.toCharArray();
        while (start < end){
            while (start < end && !judge(ch[start]))
                start++;
            while (start < end && !judge(ch[end]))
                end--;
            char first = ch[start];
            char last = ch[end];
            if (start > end)
                return true;
            if (Character.toLowerCase(first) != Character.toLowerCase(last))
                return false;
            start++;
            end--;
        }
        return true;
    }
    private boolean judge(char ch){
        if (Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z')
            return true;
        if (ch >= '0' && ch <= '9')
            return true;
        return false;
    }

}

