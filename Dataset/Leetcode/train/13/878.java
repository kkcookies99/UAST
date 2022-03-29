 class Solution {
    public int XXX(String s) {
        HashMap<Character , Integer> a = new HashMap<>();
        a.put('I' , 1);
        a.put('V' , 5);
        a.put('X' , 10);
        a.put('L' , 50);
        a.put('C' , 100);
        a.put('D' , 500);
        a.put('M' , 1000);
        int res = 0;
        
        for (int i = 0; i < s.length() ; i++) {
            char d = s.charAt(i);
            int e = a.get(d);
            if (d == 'I' && i < s.length() - 1 ){
                e = (s.charAt(i+1) == 'V' || s.charAt(i+1) =='X') ? -1 : 1;
            }
            if (d == 'X' && i < s.length() - 1){
                e = (s.charAt(i+1) == 'L' || s.charAt(i+1) =='C') ? -10 : 10;
            }
            if (d == 'C' && i < s.length() - 1){
                e = (s.charAt(i+1) == 'D' || s.charAt(i+1) =='M') ? -100 : 100;
            }


            res += e ;

        }
        System.out.println(res);
        return res;
    }
}

