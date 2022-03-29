class Solution {
    public int XXX(int x){
        long temp=0;
        while(x!=0){
            temp*=10;
            temp+=x%10;
            x/=10;
        }
        if(temp<Integer.MIN_VALUE || temp>Integer.MAX_VALUE)
            return 0;
        return (int)temp;
	}	
}

