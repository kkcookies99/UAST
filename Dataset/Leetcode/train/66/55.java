 public int[] XXX(int[] digits) {
        int add = 1;
        int i=digits.length-1;
        while(i>=0){
            int add_value = digits[i]+add;
            digits[i] = add_value%10;
            add = add_value/10;
            if(add==0) break;
            i--;
        }
        if(add==1){
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for(int k=1; k<result.length; k++){
                result[k] = digits[k-1];
            }
            return result;
        }else{
            return digits;
        }
    }

