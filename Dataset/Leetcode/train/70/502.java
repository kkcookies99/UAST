class Solution {
    public int XXX(int n) {
        int last = 1,last2 = 1;
        for(int i = 2;i<=n;i++){
            int t = last+last2;
            last2 = last;
            last = t; 
        }
        return last;
    }
}

