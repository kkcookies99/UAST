class Solution {
    public int XXX(int x) {
		int ans=0;
		int flag=x>0?1:-1;
		x=x>0?x:-x;
		while(x!=0){
            if(ans!=(ans*10)/10)return 0;
			ans=ans*10+x%10;
			x/=10;
		}
		return flag*ans;
    }
}

