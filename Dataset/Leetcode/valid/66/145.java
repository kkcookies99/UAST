 public int[] XXX(int[] digits) {
        //如果最后一位出现9，会有进位
        int len = digits.length;
        
        if(digits[len-1]<9){
            digits[len-1] = digits[len-1]+1;
            return digits;
        }else{
            ArrayList<Integer> list = new ArrayList<>();
            int carry = 1;
            int x = 0;
            list.add(0);
            for(int i=digits.length-2;i>=0;i--){
                x = digits[i] + carry>9?0:digits[i] + carry;
                list.add(x);
                carry = digits[i] + carry>9?1:0;
            }
            if(carry==1){list.add(1);}
            int count = list.size();
            int[] res = new int[count];
            int index = 0;
            for(int i = count-1;i>=0;i--){
                res[index++] = list.get(i);
            }
            return res;
        }
    }

