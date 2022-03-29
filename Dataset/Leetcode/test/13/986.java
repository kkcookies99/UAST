 class Solution {
    public int XXX(String s) {
        Map<String,Integer> sMap = new HashMap();
        sMap.put("I",1);
        sMap.put("V",5);
        sMap.put("X",10);
        sMap.put("L",50);
        sMap.put("C",100);
        sMap.put("D",500);
        sMap.put("M",1000);
        sMap.put("IV",4);
        sMap.put("IX",9);
        sMap.put("XL",40);
        sMap.put("XC",90);
        sMap.put("CD",400);
        sMap.put("CM",900);

        int sum = 0;
        while(null != s && s.length() >= 2){
            if(null != sMap.get(s.substring(0,2))){
                sum += sMap.get(s.substring(0,2));
                s = s.substring(2);
            } else {
                sum += sMap.get(s.substring(0,1));
                s = s.substring(1);
            }
        }
        if(null != s && s.length() == 1){
            sum += sMap.get(s);
        }
        return sum;
    }
}

