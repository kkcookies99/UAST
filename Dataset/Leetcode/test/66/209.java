 class Solution {
    public int[] XXX(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
        if(digits[i]<9){
            digits[i] = digits[i] + 1;
            break;
            }else {
                digits[i] = 0;
            }
        }
        if(digits[0] == 0){
            List<Integer> list = Arrays.stream(digits).boxed().collect(Collectors.toList());
            list.add(0, 1);
            int[] arr1 = list.stream().mapToInt(Integer::valueOf).toArray();
            return arr1;

        }
        return digits;
    }

}
//官方
  // digits 中所有的元素均为 9
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;


