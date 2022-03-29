 class Solution {
    public String XXX(String[] strs) {
        return lPrefix(strs, 0 , strs.length - 1);
    }

    public String lPrefix(String[] strs, int i,  int j) {

        if(i >= j) {
            return strs[j];
        }

        String l1 = lPrefix(strs, i,  j / 2 + i / 2);
        String l2 = lPrefix(strs, j / 2 + i / 2 + 1,  j);

        int length = Math.min(l1.length(), l2.length());
        int num = 0;
        for(; num < length; num++) {
            if(l1.charAt(num) != l2.charAt(num)) {
                break;
            }
        }

        if(num == 0) {
            return "";
        }

        return l1.substring(0, num);
    }
}

