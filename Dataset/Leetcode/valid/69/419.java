class Solution {
    public int XXX(int x) {
        if(x==1) return 1;
        if(x==0) return 0;
        int i;
        if(x>46340*46340) return 46340;
        for(i=46340;i>=1;i--){
            if(i*i < x) return i;
            else if(i*i == x) return i;
            
        }
        return i-1;
    }
}

