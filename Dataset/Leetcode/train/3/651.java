 class Solution {
    public int XXX(String s) {
        int ant = 0;
        if(s!=null&&s.length()>0){
            char[] chars = s.toCharArray();
            Map<Character,Integer> map = new HashMap<>();
            for(int i = 0;i<s.length();i++){
                Character a = chars[i];
                if(map.containsKey(a)){
                    i = map.get(a);
                    map = new HashMap<>();
                }else{
                    map.put(a,i);
                }
                ant = Math.max(ant,map.size());
            }
        }
        return ant;
    }
}```

