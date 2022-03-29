 class Solution {
    public int XXX(String s) {
        //特殊情况1
        if(s.equals("")){
            return 0;
        }
        s.trim();
        int count=0;
        char c;
        //用作标记防止与前面比较过的重复比较
        int flag=-1;
        Map<Character,Integer> map=new HashMap<>();
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            //用作标记防止与前面比较过的重复比较
            if(map.containsKey(c)&&map.get(c)>flag){
                flag=map.get(c);
                set.add(count);
                count=i-map.get(c);
                //由于map不允许重复元素
                map.remove(c);
            }else{
                ++count;
            }
            map.put(s.charAt(i),i);
        }
        set.add(count);
        //字符串只有一个元素，恒为1
        if(set.size()==0){
            return 1;
        }
        return Collections.max(set);
    }
}

