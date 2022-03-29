 class Solution {
    public int XXX(String s) {
        //先处理特殊情况，将特殊情况用占位符表示
        //IV=A=4，IX=B=9,XL=E=40,XC=F=90,CD=J= 400 CM=K=900
        HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
        s = s.replaceAll("IV","A");
        s = s.replaceAll("IX","B");
        s = s.replaceAll("XL","E");
        s = s.replaceAll("XC","F");
        s = s.replaceAll("CD","J");
        s = s.replaceAll("CM","K");
        hash.put('A',4);
        hash.put('B',9);
        hash.put('E',40);
        hash.put('F',90);
        hash.put('J',400);
        hash.put('K',900);
        hash.put('I',1);
        hash.put('V',5);
        hash.put('X',10);
        hash.put('L',50);
        hash.put('C',100);
        hash.put('D',500);
        hash.put('M',1000);
        int result = 0;
        for(char c:s.toCharArray()){
            result += hash.get(c);
        }return result;
    }
}

