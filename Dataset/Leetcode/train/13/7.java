class Solution {
    public int XXX(String s) {
        int sum = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(i < chars.length - 1 && map.get(chars[i]) < map.get(chars[i + 1])) sum -= map.get(chars[i]);
            else sum += map.get(chars[i]);
        }
        return sum;
    }
}

