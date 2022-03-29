 class Solution {
    public int XXX(String s) {
        if(s.equals("")) return 0;
        int length = s.length();
        if(length==1) return 1;
        char[] a = s.toCharArray();
        int res = 0;
        int i = 0;
        int j = 1;
        while (j < length) {
            for (int x = i; x < j; x++) {
                if (a[x] == a[j]) {
                    if (j - i > res) {
                        res = j - i;
                    }
                    i = x + 1;
                    break;
                } 
            }
            if(j == length -1) {
                    if(j - i + 1 > res) {
                        res = j-i+1;
                    }
                }
            j++;
        }
        return res;
    }
}


