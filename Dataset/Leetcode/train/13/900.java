 class Solution {
    public int XXX(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        h.put('I', 1);
        h.put('V', 5);
        h.put('X', 10);
        h.put('L', 50);
        h.put('C', 100);
        h.put('D', 500);
        h.put('M', 1000);
        char[] chars = s.toCharArray();
        int result = 0;
        char last = '0';
        for(int i = 0; i < chars.length; i++) {
            // 查看一下是否比前面的那个大
             if(last != '0') {
                    // 判断chars[i]是否大于last
                    if(h.get(chars[i]) > h.get(last)) {
                        result = result - 2 * h.get(last) + h.get(chars[i]);
                        last = '0';
                    } else {
                        result += h.get(chars[i]);
                        last = chars[i];
                    }
                } else {
                    int a = h.get(chars[i]);
                    result += a;
                    last = chars[i];
            }
        }
        return result;
    }
}

