 public String XXX(String s, int numRows) {
	if (numRows==1) return s;
	
	StringBuffer b = new StringBuffer();
	int len =s.length();
	int j;
	for(int row=1;row<=numRows;row++) {
		
		if(row==1||row==numRows) {//第一行和最后一行就是单纯的等差数列；
			j=row;
			while(j<=len) {
    			b.append(s.charAt(j-1));
    			j=j+2*numRows-2;
    		}
		}
		else {                      /*n代表这一行的第几个，
                                                                                                           从第0个开始计数，如果是滴偶数个就是等差数列，
            						如果是第奇数个，则和前一个相差2*(numRows-row)*/                 
			j=row;
			int n=0;
			while (j<=len) {
				b.append(s.charAt(j-1));
				
				if(n%2==0) {                   
					j=j+2*(numRows-row);
					n++;
				}
				else {
					j=row+(n+1)/2*(2*numRows-2);
					n++;
				}
				
			}
		}
		
	}
	return b.toString();
}
