 class Solution {
    public String XXX(String s) {
   char[] ss=s.toCharArray();
		String zchw="";
	    String sf="";
	    //得到s反
	    for(int i=s.length()-1;i>=0;i--){
	            sf+=ss[i];
	    }
	   //求s与s反的最长公共字串，并判断索引
	   int[][] aa = new int[s.length()][s.length()];
	   /*构造字符矩阵如：
	    *      a  b  a  c
	    *    c          1
	    *    a 1
	    *    b    2
	    *    a 1     3
	    *    斜线最长的为最长字串  aba
	    * **/
	   int  max=-1,zzb=0;//记录最大值和所在行纵坐标
	   int sfysy=0;
	   for(int i=0;i<s.length();i++) {
		   for(int j=0;j<s.length();j++) {
			if(sf.charAt(i)!=s.charAt(j)) aa[i][j]=0;
			else {
				if(i==0||j==0) aa[i][j]=1;
				else aa[i][j]=aa[i-1][j-1]+1;
				sfysy=s.length()-1-(i-aa[i][j]+1);
					if(sfysy==j) { 
					if(aa[i][j]>=max) {
						max=aa[i][j];
					     zzb=i;
					}
			 }
			}
		  }
	   }
	   for(int i=zzb,j=0;j<max;i--,j++) {
		   zchw+=sf.charAt(i);
	   }
		return zchw;
 }
}

