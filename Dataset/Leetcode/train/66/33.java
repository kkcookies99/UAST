 class Solution {
    public int[] XXX(int[] digits) {
        int num;
        for (int i = digits.length - 1; i >= 0; i--) {
            num = (digits[i] + 1) / 10;
            if (num < 1) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            List<Integer> collect = Arrays.stream(digits).boxed().collect(Collectors.toList());
            collect.add(0, 1);
            int[] result = collect.stream().mapToInt(Integer::valueOf).toArray();
            return result;
        }
        return digits;
    }
}

