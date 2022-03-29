class Solution {
    public boolean XXX(int x) {
        String str = Integer.toString(x);
        int l = 0;
        int r = str.length() - 1;

        while(l < r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }


            l++;
            r--;
        }

        return true;
    }
}

