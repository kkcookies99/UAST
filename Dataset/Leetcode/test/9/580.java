 class Solution {
    public boolean XXX(int x) {
        boolean res = false;
        if (x < 0) return res;
        String str = String.valueOf(x);
        int low = 0;
        int high = str.length() - 1;
        while(low < high){
            if (str.charAt(low) == str.charAt(high)){
                low++;
                high--;
            } else {
                return res;
            }
        }
        res = true;
        return res;
    }
}

