class Solution {
    public int[] XXX(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            System.out.println(i);
            //End 数据加一后的结果
            int End = digits[i] + 1;
            if (End > 9) {
                //如果走到 i == 0,说明digtis[0]为9需要进位,就设置一个新数组设置头为1再将原数组拼接返回
                if (i == 0) {
                    digits[0] = End%10;
                    int[] newList = new int[length+1];
                    newList[0] = 1;
                    System.arraycopy(digits,0,newList,1,length);
                    return newList;
                } else {
                    digits[i] = End % 10;
                }
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        return digits;
    }
}

