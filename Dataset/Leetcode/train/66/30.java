 class Solution {
    public int[] XXX(int[] digits) {
        int k =0;//记录第一个不等于9的位置（从后往前）
        //遍历数组，从后向前，找到第一个不等于9的位置
        for (int i =digits.length-1; i >=0; i--) 
        {
            if(digits[i]!=9)
            {
                k=i;
                break;
            }
            //如果遍历完数组，说明所有位置都为9，即999...，那么其值必定为1000...
            //即数组长度加一，第一位为1，其他位置均为0
            if(i==0){
                int[] res =new int[digits.length+1];
                for (int j = 0; j <= digits.length; j++) 
                {
                    res[j]=0;
                }
                res[0] +=1;
                return res;
            }
        }
        //如果最后一位不为9，即...y(y:0-8),将最后一位加一即可
        if(digits[digits.length-1]!=9)
        {
            int[] res =new int[digits.length];
            for (int i = 0; i < digits.length; i++) 
            {
                res[i]=digits[i];
            }
            res[digits.length-1] +=1;
            return res;
        }else {
            //如果数组中间某一位不为9，即...y9..(y:0-8),那么将后面为9的位置均置0，然后第k位加一即可
            for (int i =k+1; i < digits.length; i++) 
            {
                digits[i]=0;
            }
            int[] res =new int[digits.length];
            for (int j = 0; j < digits.length; j++) 
            {
                res[j]=digits[j];
            }
            res[k]+=1;
            return res;
        }
    }
}

