 class Solution {
    public String XXX(String s) {

        //定义暂时存储空间
         String temp;           
		 String maxStr = "";
		 int maxLen = 0;
		 int curLen = 0;
		 
		 if(s.length() == 1)
			 return s;
		 
		 int low,high;
		
		//求最大奇数回文字符串
		for(int i=0;i<s.length();i++) {
				 
			low=high=i;
				 
			while(low>=0 && high<s.length() && s.charAt(low) == s.charAt(high)) {
				low--;
				high++;
			}
			temp = s.substring(low+1, high);
			curLen = temp.length();
			if(maxLen < curLen)
				maxStr = temp;
			maxLen = Math.max(curLen, maxLen);
				 
		}
        //求最长偶数回文字符串
		for(int i=0;i<s.length();i++) {
			 
			low = i;
			high = i+1;
				 
			while(low>=0 && high<s.length() && s.charAt(low) == s.charAt(high)) {
				low--;
				high++;
			}
		//比较求出最长回文字符串
			temp = s.substring(low+1, high);
			curLen = temp.length();
			if(maxLen < curLen)
				maxStr = temp;
			maxLen = Math.max(curLen, maxLen);	 
		}
			 
		return maxStr;
    }
}

