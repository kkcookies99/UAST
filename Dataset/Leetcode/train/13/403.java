 class Solution {
    public int XXX(String s) {
        HashMap<Character, Integer> map = new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] ss = s.toCharArray();
        int res = map.get(ss[0]);
        for(int i = 1; i < ss.length; i ++){
              res += map.get(ss[i]);
            if(map.get(ss[i-1]) < map.get(ss[i])){
              res -= 2*map.get(ss[i-1]);
            }
        }
        return res;
    }
}

