 class Solution {
    public int XXX(String s) {
        
        //存放新字符串
        StringBuffer str = new StringBuffer("");
        
        //存放长度列表
        ArrayList list = new ArrayList();
        
        //当前子串长度
        int count = 0;
        
        //记录当前是第几个循环
        int jilu = 0;
        for(int i = 0; i < s.length(); i++) {
            
            if(contains(str,s.charAt(i))){
                list.add(count);
                count = 1;
                
                i = ++jilu;
                str = new StringBuffer((s.charAt(i) + ""));
            } else {
                count ++;
                str.append(s.charAt(i));
            }
            
            if(i == s.length()-1){
                list.add(count);
            }
        }
        
        int len = 0;
        for(int i = 0; i < list.size() ;i++){
            int temp = (Integer)list.get(i);
            if(temp > len){
                len = temp;
            }
        }
        
        return len;
    }
    
    //判断StringBuffer是否包含某字符
    private boolean contains(StringBuffer sb,char c){
        String str = c + "";
        if(sb.indexOf(str) == -1){
            return false;
        } else {
            return true;
        }
    }
}

