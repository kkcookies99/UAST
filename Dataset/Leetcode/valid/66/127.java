 class Solution {
    public int[] XXX(int[] digits) {
         int a=1;
            for(int i=digits.length-1;i>=0;i--){//判断后几位是9
                if(digits[i]!=9) {
                    break;
                }
                a++;                            //数组后面共有a-1个连续的9
            }
            if(a==digits.length+1){            //判断是不是整个数组都是9，如果是则拓展数组
                int []b=new int[a];
                b[0]=1;
                for(int i=1;i<b.length;i++){
                    b[i]=0;
                }
                return b;              //全是9的话加完1，最高位是1，其余都是0。直接返回拓展后的数组
            }
            else{                       //不是的话，则让下标位length-a上加1，后面的位数置零
                digits[digits.length-a]+=1;
                for(int i=a-1;i>0;i--){
                    digits[digits.length-i]=0;
                }
            
        }
        return digits;
    }
}


