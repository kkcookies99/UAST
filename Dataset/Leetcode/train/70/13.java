class Solution {
    public int XXX(int n) {
        int[] num = new int[n+1];
        for(int i = 0;i < num.length;i++){
            num[i] = -1;
        }
        return process2(n,num);
    }

    //递归版本
    public int process(int rest){
        if(rest == 0){
            return 1;
        }if(rest < 0){
            return 0;
        }
        //走1阶楼梯
        int way1 = process(rest-1);
        int way2 = process(rest-2);
        return way1+way2;
    }

    //动态图版本
    public int process2(int n,int[] num){
        if(n < 0){
            return 0;
        }else if(n == 0){
            return 1;
        }else{  //还需要继续走
            //继续走的路如果计算过则直接返回
            if(num[n] != -1){
                return num[n];
            }
            //没计算过，则可以分为走一步和走两步
            int w1 = process2(n-1,num);
            int w2 = process2(n-2,num);
            num[n] = w1+w2;
        }
        return num[n];
    }
}

