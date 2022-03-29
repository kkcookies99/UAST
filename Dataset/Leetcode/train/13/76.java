class Solution {
    public int XXX(String s) {
        int res=0;
        HashMap<Character,Integer>hash =new HashMap<>();
        hash.put('I',1);
        hash.put('V',5);
        hash.put('X',10);
        hash.put('L',50);
        hash.put('C',100);
        hash.put('D',500);
        hash.put('M',1000);
        for (int i = s.length()-1; i>=0; i--) {
            if((i-1)>=0 && s.charAt(i-1)=='I' && hash.get(s.charAt(i))>1){
                res+=hash.get(s.charAt(i))-1;
                i--;
                continue;
            }
            if((i-1)>=0 && s.charAt(i-1)=='X'&& hash.get(s.charAt(i))>10 ){
                res+=hash.get(s.charAt(i))-10;
                i--;
                continue;
            }

            if((i-1)>=0 && s.charAt(i-1)=='C'&&hash.get(s.charAt(i))>100){
                res+=hash.get(s.charAt(i))-100;
                i--;
                continue;
            }
            else
                res+=hash.get(s.charAt(i));
        }
        return res;
    }
}

