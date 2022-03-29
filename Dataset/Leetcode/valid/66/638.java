class Solution {
    public int[] XXX(int[] digits) {
        int index = digits.length - 1;
        int dig = digits[index] + 1;
        if (dig % 10 != 0) {
            digits[index] = dig;
            return digits;
        }
        int i = 0;
        int remainder = 0;
        boolean flag = true;
        while (i <= index) {
            if (flag) {
            int digs = digits[index - i] + 1;
            remainder = digs % 10;
                digits[index - i] = remainder;
            }
            if (remainder == 0) flag = true;
            else flag = false;
            i++;
        }
        int[] newArray = digits;
        if (newArray[0] % 10 == 0) {
            List<Integer> list = new ArrayList<>(digits.length);
            for (int s : digits) {list.add(s);};
            list.add(0,digits[0] + 1);
            Integer[] temp = new Integer[list.size()];
            Integer[] objects = (Integer[]) list.toArray(temp);
            newArray = Arrays.stream(objects).mapToInt(Integer::valueOf).toArray();
        }
        return newArray;
    }
}

