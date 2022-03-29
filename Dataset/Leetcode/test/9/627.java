 class Solution {
    public boolean XXX(int x) {
        String str = Integer.toString(x);
        for (int i = 0, j = str.length() - 1; i < j; i++, j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}

