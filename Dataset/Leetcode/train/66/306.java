 class Solution {
    public int[] XXX(int[] digits) {
        ArrayList<Integer> array = new ArrayList<>();
        int temp  = 1;
        for(int i = digits.length-1;i>=0;i--){
            digits[i] += temp;
            if(digits[i] == 10){
                digits[i] = 0;
                temp  = 1;
            } else {
                temp = 0;
            }
            array.add(0,digits[i]);
        }
        if(temp == 1){
           array.add(0,1); 
        }
        int[] intArr = array.stream().mapToInt(Integer::intValue).toArray();
        return intArr;
    }
}

