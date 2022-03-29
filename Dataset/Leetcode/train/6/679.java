 class Solution {
    public String XXX(String s, int numRows) {
	StringBuilder s1=new StringBuilder();
    if(numRows==1)return s;//特殊情况的处理
	int n=(numRows-1)*2;//每个周期的数
    int i=0;//用来寻找每个周期第一个数
    int mark=0;//用来判断是否是每个周期的第一个数
	int location=0;//每次循环的位置
	while(s1.length()<s.length()) {
		 location+=n*mark;//每次都要进行位置的更新
		 mark=1;//用来判断是否为周期的第一个数
		if(location>=s.length()) {
			i++;//周期第一个数的改变
			n=(numRows-1)*2-i*2>0?(numRows-1)*2-i*2:(numRows-1)*2;
			n=(numRows-1)*2-n>0?(numRows-1)*2-n:n;//n的下一个位置
			location=i;mark=0;continue;
		}
		s1.append(s.charAt(location));
		n=(numRows-1)*2-n>0?(numRows-1)*2-n:n;
	}
	return s1.toString();
    }
}

