class Solution {
    public int XXX(String s) {
        //有个前提，题目说给定数字是罗马数字，不需要我们做校验
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        map.put('A', 0);
        
        s = s+"A";
        //前面的字符比后面的小，则加上两者的正差值，否则直接加上该值
        for(int i=0; i<s.length()-1; i++){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                res += map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                i++;
            }else{
                res += map.get(s.charAt(i));
            }
        }
        
        return res;
    }
}

