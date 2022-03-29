 class Solution {
    public int XXX(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('A',4);// IV A
        map.put('V',5);
        map.put('B',9); // IX B
        map.put('X',10);
        map.put('E',40); // XL E
        map.put('L',50);
        map.put('O',90); // XC O
        map.put('C',100);
        map.put('P',400); // CD P
        map.put('D',500);
        map.put('Q',900); // CM Q
        map.put('M',1000);
        String s1=s.replace("IV","A").replace("IX","B").replace("XL","E").replace("XC","O").replace("CD","P").replace("CM","Q");
        int sum=0;
        for(int i=0;i<s1.length();i++){
            sum+=map.get(s1.charAt(i));
        }
        return sum;
    }
}

