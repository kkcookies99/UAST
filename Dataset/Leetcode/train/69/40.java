class Solution {
    public int XXX(int x) {
        for(int i = 0; i<=46340; i++){
            if(i*i<=x && (i+1)*(i+1)>x)return i;
        }
        return 46340;


    }
}

