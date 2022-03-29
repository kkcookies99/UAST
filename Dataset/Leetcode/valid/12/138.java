 class Solution {
    public String XXX(int num) {
        StringBuilder sb = new StringBuilder();
        Map<Integer,Character> map = new HashMap(){
            {
                put(1,'I');
                put(5,'V');
                put(10,'X');
                put(50,'L');
                put(100,'C');
                put(500,'D');
                put(1000,'M');
            }
        };
        int[] bits = new int[]{1000,500,100,50,10,5,1};
        int i=0;
        while(i<bits.length){
            int bit = bits[i];
            int cur = num/bit;//算出高位数值
            if(cur==0){//高位为0 
                if((bit==1000||bit==100||bit==10)&&(num/bits[i+2]==9)){
                    //这里如果是1000 100 10，那么利用100 10 1来判断是否为9，特殊处理
                    sb.append(map.get(bits[i+2])).append(map.get(bit));
                    num %= bits[i+2];//500 50 5不用管了
                    i = +2;//进两位
                }else if((bit==500||bit==50||bit==5)&&(num/bits[i+1]==4)){
                    //同理这里如果是500 50 5，那么利用100 10 1来判断是否为4，特殊处理
                    sb.append(map.get(bits[i+1])).append(map.get(bit));
                    num %= bits[i+1];
                    i++;//只进一位
                }else{
                    //都不满足，那么这一位没有值，跳过，这里可能是上一位处理过9和4，这里来进位
                    num %= bit;
                    i++;
                }
            }else{
                for(int j=0;j<cur;j++){
                    sb.append(map.get(bit));
                }
                num %= bit;
                //注意，这里不能进位，下一次循环cur为0，我们要判断是否有特殊的9和4
            }
        }
        return sb.toString();
    }
}

