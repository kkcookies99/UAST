 class Solution {
    public int XXX(String s) {
        int n = s.length();
        // 存储出现字符串和索引
        HashMap<Character,Integer> map=new HashMap<>();
        int len = 0;
        char[] ch = s.toCharArray();
        // 标记,只看该标记及以后的字符
        int target = 0;
        for(int i=0;i<n;i++){
            // 当前字串不存在重复
           if(!map.containsKey(ch[i])){
               // 存入哈希表
               map.put(ch[i],i);
               // 将原来长度与新长度比较
               len=Math.max(len,(i-target+1));
           }
           else{  
            // 当已有改字符，如果字符在标记之前，只要比较长度
            if(map.get(ch[i])<target){
                
                len=Math.max(len,(i-target+1));
            }
            else{
                // 在标记之后，target移动到ch[i]旧索引的后一位
                target=map.get(ch[i])+1;  
            }
            // 将ch[i]索引更新
            map.put(ch[i],i);       
           }
       }
        return len;
    }
}

