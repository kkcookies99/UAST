 class Solution {
    public int XXX(int m, int n) {
        //全部改成long为了防止溢出
        long x = m + n - 2;
		//利用组合的互补率进行优化，减少循环次数
		long y = n - 1 > m - 1 ? m - 1 : n - 1;
		
		long mother = 1;//分母
		long son = 1;//分子
		
		for(long i = y;i > 0; i--) {
			son *= x;
			mother *= i;
			x--;
		}
		return (int) (son / mother);
    }
}

