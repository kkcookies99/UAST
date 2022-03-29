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
        int res=0;

        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
             Integer curr = map.get(c[i]);
            if (i==0){
                res+=map.get(c[0]);
            }else {
                Integer pre = map.get(c[i - 1]);
                if (pre<curr){
                    res=res-2*pre+curr;
                }else {
                    res+=curr;
                }
            }
        }
        return res;
    }
}

