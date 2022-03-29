 public String XXX(String s) {
    String S="";
	if(s==null||s.length()==0) {//s为空
		return S;
	}
    int n=s.length();
    char[] a=s.toCharArray();
    int i,j,low=0,high=0,length;//low记录最长的低坐标，high记录最长的高坐标
    for(int k=0;k<n;k++) {
    	//奇回文串，以k为中心点，向左右两边判断
    	i=j=k;
    	length=high-low;
    	while(i>=0&&j<n&&a[i]==a[j]) {
    		if(length<j-i+1) {
    			length=j-i+1;
    			low=i;
    			high=j;
    		}
    		i--;
    		j++;
    	}
    	//偶回文串，以k和k+1为中心点，向左右两边判断
    	i=k;
    	j=k+1;
    	while(i>=0&&j<n&&a[i]==a[j]) {
    		if(length<j-i+1) {
    			length=j-i+1;
    			low=i;
    			high=j;
    		}
    		i--;
    		j++;
    	}
    }
    return S=s.substring(low, high+1);
}

