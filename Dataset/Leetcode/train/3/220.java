 public static  int XXX(String s) {
    int res = 0;
    Map<Character,Integer> map = new HashMap<>();
    int left=0,right=0;
    int index = 0;//辅助指针
   while(right<s.length()){
        char tmp = s.charAt(right);
       //若map没有，说明可以加入该字符
        if(!map.containsKey(tmp)){
            map.put(tmp,right);//存入索引
        }
        //map包含了这个，所以要移动left直到不包含它
        //同时也要去掉map中所有的左边的元素
        else{
           left = map.get(tmp)+1;//更新left下标
           while (index<left){
            map.remove(s.charAt(index++));
           }
            map.put(tmp,right);//存入索引
        }
   
     res = Math.max(res,right-left+1);
        right++;
    }
   return  res;
}

