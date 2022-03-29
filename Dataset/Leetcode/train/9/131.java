public boolean XXX(int x) {
        if(x==0){
            return true;
        }
        if(x<0){
            return false;
        }
        int tmp = x;
        // sum是反转后的数字，last是每次循环最低位
        int sum = 0,last=0;
        while(tmp!=0){
            // 取余得到最低位
            last=tmp%10;
            // 累加到结果
            sum = sum*10+last;
            tmp/=10;
        }
        // 判断反转后的数字是否等于原数字
	return sum == x;
    }

