class Solution {
    public int XXX(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int re= 0;
        int ii=0;
        int xx=0;
        int cc=0;
        for (Character mapstring:map.keySet()) {
            int mapvalue=map.get(mapstring);
            int count = 0;
            char[] charArray = s.toCharArray();
            for (char item : charArray) {
                if (item == mapstring) {
                    count++;
                }
            }
            re= re+count*mapvalue;
        }
        for (int i = 0; i < s.toCharArray().length; i++) {
            if(s.charAt(i) == 'I'|s.charAt(i)=='X'|s.charAt(i)=='C'){
                if(i!=(s.toCharArray().length-1)){
                    if(s.charAt(i+1)!=s.charAt(i)){
                        if(s.charAt(i)== 'I'&(s.charAt(i+1)== 'V'|s.charAt(i+1)=='X')){
                            i++;
                            ii++;
                        }else if(s.charAt(i)== 'X'& (s.charAt(i+1)== 'L'|s.charAt(i+1)=='C')){
                            i++;
                            xx++;
                        }else if(s.charAt(i)=='C'& (s.charAt(i+1)== 'D'|s.charAt(i+1)=='M')){
                            i++;
                            cc++;
                        }
                    }
                }
            }
        }
        return re-ii*2*1-xx*2*10-cc*2*100;
    }
}

