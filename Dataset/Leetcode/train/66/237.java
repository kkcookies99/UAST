 class Solution {
    public int[] XXX(int[] digits) {
        int i = digits.length - 1;
        add1(digits,i);
        if(digits[0] == 0){
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            for (int z = 0;z < digits.length;z ++){
                arr[z + 1] = digits[z];
            }
            return arr;
        }
        else{
            return digits;
        }
    }

    public static void add1(int[] arr,int i){
        if (arr[i] == 9){
            arr[i] = 0;
            if (i != 0){
                i -= 1;
                add1(arr,i);
            }
        }else{
            arr[i] += 1;
        }
    }
}

