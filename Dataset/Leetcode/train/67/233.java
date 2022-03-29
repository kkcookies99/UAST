 class Solution {
    public String XXX(String a, String b) {
        StringBuilder result = new StringBuilder();
        int upper = 0;
        for(int i = 1;i <= a.length() || i <= b.length();i++) {
            int thisNum = upper;
            thisNum += i <= a.length() ? a.charAt(a.length() - i) - '0' : 0;
            thisNum += i <= b.length() ? b.charAt(b.length() - i) - '0' : 0;
            upper = thisNum / 2;
            result.insert(0,thisNum%2);
        }
        result.insert(0,upper == 1?"1":"");
        return result.toString();
    }
}

