 class Solution {
    public int XXX(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length()){
            return -1;
        }
        int begin = 0;
        boolean flag = false;
        for (int i=0;i<haystack.length();i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = i;
                begin = i;
                if (i+needle.length() > haystack.length()) {
                    break;
                }
                for (j=i;j<needle.length()+i&&j<haystack.length();j++) {
                    if (haystack.charAt(j) != needle.charAt(j-i)) {
                        break;
                    }
                }
                if (j==needle.length()+i) {
                    flag = true;
                    break;
                }
                
            }
        }
        return flag? begin:-1;
    }
}

