 class Solution {
    public int XXX(String s) {
       int len = s.length();

       Map<String,Integer> map = new HashMap<>();
       map.put("M",1000);
       map.put("CM",900);
       map.put("D",500);
       map.put("CD",400);
       map.put("C",100);
       map.put("XC",90);
       map.put("L",50);
       map.put("XL",40);
       map.put("X",10);
       map.put("IX",9);
       map.put("V",5);
       map.put("IV",4);
       map.put("I",1);

       if(len==1) return map.get(s);
       int res = 0;
       for(int i = 0 ; i < len ; ){
           if(i < len-1 && map.containsKey(s.substring(i,i+2))){
               res += map.get(s.substring(i,i+2));
               i +=2;
           }else{
               res += map.get(s.substring(i,i+1));
               i++;
           }
       }
       return res;
    }
}

