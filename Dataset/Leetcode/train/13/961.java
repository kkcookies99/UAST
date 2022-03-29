 class Solution {
    public int XXX(String s) {
        s = s+"#";
        int res = 0;
        Map map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        map.put('#',0);
        int i = 0, j=0, k=0;
        char a,b;
        while(i<s.length()-1){
            a = s.charAt(i);
            b = s.charAt(i+1);
            j = (Integer)map.get(a);
            k = (Integer)map.get(b);
            if (j>=k){
                res+=j;
                i++;
            }else {
                res=res+k-j;
                i+=2;
            }
        }
        return res;
    }
}

