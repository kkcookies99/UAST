 class Solution {
    public int[] XXX(int[] digits) {
        //先放在list里面，最后再转为int[]
        List<Integer> list = new ArrayList<>();
        int len = digits.length;
        int add = 0;
        for(int i=len-1;i>=0;i--){
            int item = 0;
            if(i==len-1){
                item = digits[i]+1;
            }else{
                item = digits[i]+add;
            }
            int temp = item%10;
            add = item/10;
            list.add(temp);
        }
        if(add>0){
            list.add(add);
        }
        int[] res = new int[list.size()];
        int idx=0;
        for(int i=list.size()-1;i>=0;i--){
            res[idx++] = list.get(i);
        }
        return res;
    }
}