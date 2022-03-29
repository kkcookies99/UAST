class Solution {
    public int XXX(String s) {
        int n = s.length();
        if(n == 0) return 0;
        char[] arr = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res = 0;
        for(int i = 0; i < arr.length; i++) {
            char c = arr[i];
            res += map.get(c);
            if(i > 0 && map.get(c) > map.get(arr[i-1])) {
                res -= 2*map.get(arr[i-1]);
            }
        }
        return res;
    }
}

