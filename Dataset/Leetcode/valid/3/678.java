 class Solution {
    public int XXX(String s) {
        if(s.length()==0){
            return 0;
        }
         Set set=new HashSet();
        String[] ss=s.split("");
        int i,j=0,max=0;
        for(i=0;i<ss.length;i++){
            if(!set.contains(ss[i])){
                set.add(ss[i]);
                max=Math.max(set.size(),max);
            }else{
                while(set.contains(ss[i])){
                    set.remove(ss[j]);
                    j++;
                }
            }
            set.add(ss[i]);
        }
        return max;

    }
}



