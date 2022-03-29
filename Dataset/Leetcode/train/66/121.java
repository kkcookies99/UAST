 class Solution {
    public int[] XXX(int[] digits) {
        int index = digits.length-1;
        int c = 1;
        while(index >= 0 && c>0){
            digits[index] = digits[index] + c;
            c = digits[index]/10;
            digits[index] = digits[index]%10;
            index--;
        }
        if(c>0){
            int arr[] = new int[digits.length+1];
            arr[0] = 1;
            return arr;
        }else{
            return digits;
        }
    }
}

