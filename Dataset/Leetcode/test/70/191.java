public int XXX(int n) {
        //动态规划 推导结束后发现就是个斐波那契数列
        if(n<=2){
            return n;
        }
        int first=1, second=2, total=0;
        for(int i=3;i<=n;i++){
            total=first+second;
            first=second;
            second=total;
        }
        return total;
    }

