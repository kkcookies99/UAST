class Solution {
    public int[] XXX(int[] digits) {
        int k=1,temp=0;
        List<Integer> list = new ArrayList<>();
        for (int i = digits.length - 1; i >= 0; i--) {
            temp = k + digits[i];
            list.add(temp % 10);
            k = temp/ 10;
            //最高位需要进位
            if (temp >= 10 && i == 0) {
                list.add(k);
            }
        }
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

