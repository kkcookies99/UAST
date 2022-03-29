 class Solution {
    public int XXX(String s) {
        int res=0;
        int number=0;
        Map<Character,Integer>  map=new HashMap();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            //map中已经存在，重新开始计算,开始位置为重复元素后一个位置开始
            if(map.containsKey(c)){
                i=map.get(c);
                number=0;
                map=new HashMap();
                continue;
            }
            map.put(c,i);
            number++;
            if(number>res)
            res=number;
        }
            return res;
    }
}

