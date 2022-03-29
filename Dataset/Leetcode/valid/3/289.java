 class Solution {
    public int XXX(String s) {
        if(s==null || s.length()<=0) return 0;
        int maxlen=1;
        int len=s.length();
        int p;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();

        //初始化
        p=1;
        map.put(s.charAt(0),0);
        int start=0;
        //计算
        for(int i=1;i<len;i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                int pre=map.get(c);
                //Math.min(i-pre,i-start+1)=i-Math.max(pre,start-1);
                if(i-pre<=i-start+1){
                    p=i-pre;
                    start=pre+1;
                }
                else p=p+1;
            }
            else{
               p=p+1;  
            } 
            map.put(c,i);
            //System.out.printf(p+"  ");
            maxlen=Math.max(p,maxlen);   
        }
        return maxlen;
    }   
}

