    public int[] XXX(int[] digits) {
        int n = digits.length,num = 0;
        for (int i = n - 1; i >= 0; --i) {
            if (digits[i] == 9){
                num ++;
            } else {
                break;
            }
        }
        
        if (num == n){
            int[] ans = new int[n + 1];
            ans[0] = 1;
            return ans;
        }

        if (num == 0){
            digits[n-1] = digits[n-1] + 1;
        } else {
            int j = n-1-num;
            digits[j] = digits[j] + 1;
            for (int i = j+1; i < digits.length; i++) {
                digits[i] = 0;
            }
        }
        return digits;
    }

