class Solution {
    public int XXX(int x) {
        int result = 0;
        do{
           if(214748364 < Math.abs(result)){
                return 0;
            }
            if(214748364 == Math.abs(result) && (x >7 || x<-8)){
                return 0;
            }
            result = result*10+(x%10);
        }
        while((x=x/10)!=0);
        return result;
    }
}

