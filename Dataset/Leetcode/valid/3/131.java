 class Solution {
    public int XXX(String s) {
        //方法效率很低，下一次用双指针；
        HashMap<Character, Integer> map= new HashMap();
        int ans= 0, tmp= 0;
        if(s.length()== 0) return 0;
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                //2, 如果出现了重复，先tmp记下临时长度；
                tmp= map.size();
                //3, 然后把指针调回去，然后i++自动就变成第一次位置的下一个
                i= map.get(s.charAt(i)); 
                map.clear(); 
            }
            else{
                //1, 用map存字符以及对应的位置;
                map.put(s.charAt(i), i);
                
            }
            ans= Math.max(ans, tmp);
        }
        //这一步防止最后一次记录map时没更新tmp，ans可能不准确；
        ans= Math.max(ans, map.size());
        return ans;
    }
}

