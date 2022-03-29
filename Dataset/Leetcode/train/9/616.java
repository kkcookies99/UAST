 class Solution {
    public boolean XXX(int x) {
        Integer t = new Integer(x);
        String s = t.toString();
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

