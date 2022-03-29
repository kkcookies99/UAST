class Solution {
    public int XXX(String s) {
        //先处理特殊情况，将特殊情况用占位符表示
        //IV=A=4，IX=B=9,XL=E=40,XC=F=90,CD=J= 400 CM=K=900
        s = s.replaceAll("IV", "A");
        s = s.replaceAll("IX", "B");
        s = s.replaceAll("XL", "E");
        s = s.replaceAll("XC", "F");
        s = s.replaceAll("CD", "J");
        s = s.replaceAll("CM", "K");
        Map<Character,Integer> keyMap=new HashMap<>();
        keyMap.put('I',1);
        keyMap.put('V',5);
        keyMap.put('X',10);
        keyMap.put('L',50);
        keyMap.put('C',100);
        keyMap.put('D',500);
        keyMap.put('M',1000);
        keyMap.put('A',4);
        keyMap.put('B',9);
        keyMap.put('E',40);
        keyMap.put('F',90);
        keyMap.put('J',400);
        keyMap.put('K',900);
        int result = 0;
        char[] chars=s.toCharArray();
        for (char c: chars) {
            result+=keyMap.get(c);
        }
        return result;
    }
}

