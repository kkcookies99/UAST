 class Solution {
    public int[] XXX(int[] digits) {
        int len = digits.length;
        
        // 反向迭代
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i]+1 == 10){       // 有进一就继续迭代
                digits[i] = 0;
            }else{                      // 否则退出循环
                digits[i]++;
                break;
            }  
        }
        
        
        if(len == 0){       // 空数组的时候
            return new int[]{1};
        }else if(digits[0] == 0){       // 最高位也进一的时候
            int res[] = new int[len+1];
            res[0] = 1;
            System.arraycopy(digits, 0, res, 1, len);
            return res;
        }
          
        return digits;
    }
}

