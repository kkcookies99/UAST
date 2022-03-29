class Solution {
    //翻转一半数字
	public static boolean XXX(int x) {
		if(x < 0) {
			return false;
		}else if(x < 10) {
			return true;
		}else if(x % 10 == 0){
			return false;
		}else {
			int res= 0;
			//当x>res时可能出现几种情况
			//x位数比res多，此时应当继续翻转
			//x位数与res相同，此即说明输入肯定不是回文数，所以此时再多翻转一位对结果不影响
			while(x > res) {
				res = res * 10 + x % 10;
				x /= 10;
			}
			return res == x || res / 10 == x;
		}
	}
}

