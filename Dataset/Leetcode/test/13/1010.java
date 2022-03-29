 class Solution {
    public int XXX(String s) {
        Map<String,Integer> map = new HashMap();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put(" ",0);
        String[] s1 = s.split("");
        int res=0;
        for(int i=s1.length-1;i>=0;){
            int left,right;
            right = map.get(s1[i]);
            if(i-1<0){
                left = 0;
            }else{
                left = map.get(s1[i-1]);
            }
            if(right>left){
                res = res+(right-left);
                i-=2;
            }else{
                res=res+right;
                i-=1;
            }
        }
        return res;
    }
}

