 class Solution {
    public int XXX(String s) {
        HashMap<Character, Integer> data = new HashMap() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };
        char[] s_char_arr = s.toCharArray();
        int total = data.get(s_char_arr[s_char_arr.length-1]);
        for(int i = s_char_arr.length-2;i>-1;i--){
            if (data.get(s_char_arr[i]) < data.get(s_char_arr[i+1])) {
                total -= data.get(s_char_arr[i]);
            }else {
                total += data.get(s_char_arr[i]);
            }
        }
        return total;
    }
}

