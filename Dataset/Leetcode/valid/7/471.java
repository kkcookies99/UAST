 class Solution {
    public int XXX(int x) {
        if(x==0) return 0;
        long result = 0;
        int temp = 0;
        while(x!=0){
            temp = x%10;
            x/=10;
            if(result*10>Integer.MAX_VALUE || result*10<Integer.MIN_VALUE) return 0;
            result = result*10;
            if(result+temp>Integer.MAX_VALUE || result+temp<Integer.MIN_VALUE) return 0;
            result = result+temp; 
        }
        return (int)result;
    }
}

