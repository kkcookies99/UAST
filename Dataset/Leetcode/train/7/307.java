class Solution {
    public int XXX(int x) {
        int i = 0;
        long tmp = 0L;
        if(x == 0){
            return 0;
        }
		//判断几位数
        for(;i <15;i++){
            if(x / (long)Math.pow(10,i) ==0)
                break;
        }
        for(int j = 0;j < i;j++){
			tmp += (x / (int)Math.pow(10 , i-j-1)) * (long)Math.pow(10 , j);
			x = x % (int)Math.pow(10 , i-j-1);
		}
		if(tmp > ~0>>>1 || tmp < 1<<31){
			return 0;
		}else{
			return (int)tmp;
		}
    }
}

