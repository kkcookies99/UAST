 class Solution {
    public String XXX(String[] strs) {
        if (strs == null || strs.length == 0) return "";    
            return XXX(strs, 0 , strs.length - 1);
    }

    //递归不断分成两部分
    private String XXX(String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        }
        else {
            int mid = (l + r)/2;
            String lcpLeft =   XXX(strs, l , mid);
            String lcpRight =  XXX(strs, mid + 1,r);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }
    //求两个结果的最长公共前缀
    String commonPrefix(String left,String right) {
        int min = Math.min(left.length(), right.length());       
        for (int i = 0; i < min; i++) {
            if ( left.charAt(i) != right.charAt(i) )
                return left.substring(0, i);
        }
        return left.substring(0, min);
    }

}

