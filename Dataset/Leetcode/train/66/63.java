  public int[] XXX(int[] digits) {
        boolean flag = false;
        for (int j = 0;j<digits.length;j++){
            if (digits[j]!=9) flag = true;
        }
        if (flag){
            for (int i = 0;i<digits.length;i++){
                if (digits[digits.length-1-i]==9){
                    digits[digits.length-1-i] = 0;
                }else {
                    digits[digits.length-1-i]++;
                    break;
                }
            }
        }else{
            int[] arr = new int[digits.length+1];
            arr[0] = 1;
            for (int i = 1;i< arr.length;i++){
                arr[i] = 0;
            }
            return arr;
        }
        return digits;
    }

