class Solution {
    public int XXX(String s) {
   Map<Character, Integer> romans = new LinkedHashMap<>();
        int res = 0;
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);
        char[] chars = s.toCharArray();
        if (chars.length == 1)
            return romans.get(chars[0]);
        else
            for (int i = 0; i < chars.length; i++) {
                // 只有最后一个了直接加上
                if (i == chars.length - 1)
                    return res += romans.get(chars[i]);
                int cur = romans.get(chars[i + 1] ),
                        pre = romans.get(chars[i] );
                // MCM 情况要先算 CM
                if (i + 2 < chars.length) {
                    int la = romans.get(chars[i + 2]);
                    if (la > cur) {
                        res += la - cur + pre;
                        // 跳过2个
                        i+=2;
                        continue;
                    }
                }
                if (cur <= pre)
                    res += pre + cur;
                else
                    res += cur - pre;
                // 跳过一个
                i+=1;
            }
        return res;
    }
}

