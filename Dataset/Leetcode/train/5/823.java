 class Solution {
    public String XXX(String s) {
		if(s.equals("")){
			return "";
		}
		int length=s.length();
		//dp[i][j]表示第i到第j的子串是否为回文子串
		boolean[][]dp=new boolean[length][length];
		for(int i=0;i<length;i++){
			dp[i][i]=true;
		}
		int start=0;
		int max_len=1;
		//先遍历列，再遍历行，否则会出错
		for(int j=0;j<length;j++){
			for(int i=0;i<length;i++){
				if(i>=j){
					continue;
				}
				if(i+1==j&&s.charAt(i)==s.charAt(j)){
					dp[i][j]=true;
				}else{
					dp[i][j]=dp[i+1][j-1]&&s.charAt(i)==s.charAt(j);
				}
				if(dp[i][j]&&j-i+1>max_len){
					max_len=j-i+1;
					start=i;
				}

			}
		}
		String res=new String(s.toCharArray(),start,max_len);
		return res;
	
    }
}

