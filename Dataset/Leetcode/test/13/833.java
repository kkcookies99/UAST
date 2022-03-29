 class Solution {
    public int XXX(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('M',1000);
        map.put('f',900);
        map.put('D',500);
        map.put('e',400);
        map.put('C',100);
        map.put('d',90);
        map.put('L',50);
        map.put('c',40);
        map.put('X',10);
        map.put('b',9);
        map.put('V',5);
        map.put('a',4);
        map.put('I',1);        
        s = s.replace("IV","a");
        s = s.replace("IX","b");
        s = s.replace("XL","c");
        s = s.replace("XC","d");
        s = s.replace("CD","e");
        s = s.replace("CM","f");
        int res = 0;
        int n = s.length();
        for(int i = 0;i < n;i++){
            res += map.get(s.charAt(i));         
        }
        return res;
    }
}

