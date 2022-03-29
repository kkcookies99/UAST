 class Solution {
    public int XXX(String s) {
        if(s == null || s == ""){
            return 0;
        }
        int ret = 0;
        char[] chArr = s.toCharArray();
        int i =0;
        Map<String,Integer> mapper = new HashMap();
        mapper.put("I",1);
        mapper.put("IV",4);
        mapper.put("V",5);
        mapper.put("IX",9);
        mapper.put("X",10);
        mapper.put("XL",40);
        mapper.put("L",50);
        mapper.put("XC",90);
        mapper.put("C",100);
        mapper.put("CD",400);
        mapper.put("D",500);
        mapper.put("CM",900);
        mapper.put("M",1000);
        while(i < chArr.length){
            String key = "" + chArr[i];
            if(i + 1 < chArr.length){
                if(mapper.containsKey(key+chArr[i+1])){
                    key += chArr[i+1];
                    i++;
                }
            }
            i++;
            ret += mapper.get(key);
            
        }
        return ret;
    }
}

