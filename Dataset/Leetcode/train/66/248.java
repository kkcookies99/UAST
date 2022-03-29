 class Solution {
    public int[] XXX(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int inc = 1;
        for(int i = digits.length - 1; i >= 0; i--){
            list.add((digits[i] + inc) % 10);
            inc = (digits[i] + inc) / 10;
        }
        if(inc > 0){
            list.add(inc);
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = list.get(res.length - 1 - i);
        }
        return res;
    }
}

