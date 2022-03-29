class Solution {
    public String XXX(int n) {
        String s = "1";
        for(int i = 1; i < n; i++) {
            StringBuffer newStr = new StringBuffer();
            for(int j = 0, len = s.length(); j < len; j++) {
                int count = 0;
                int index = j;
                while(index + 1 < len && s.charAt(index) == s.charAt(index + 1)) {
                    count++;
                    index++;
                }
                newStr.append(count + 1).append(s.charAt(j));
                j+= count;   
            }
            s = newStr.toString();
        }
        return s;
    }
}

