 class Solution {
    public String XXX(String s) {
        if(s.length()==1)
        return s;
        char[] chs=s.toCharArray();
        int maxSize=0,maxStart=0;;
        for(int i=0;i<chs.length;i++){
            if(maxSize>chs.length-i)
            break;
            for(int j=i+1;j<chs.length;j++){
                int start=i,end=j;
                boolean flag=true;
                while(start<end){
                    if(chs[start]!=chs[end]){
                    flag=false;
                    break;
                    }
                    start++;
                    end--;
                }
                // if(flag)
                // System.out.println(s.substring(i,j+1));
                if(flag&&j-i>maxSize){
                    maxSize=j-i;
                    maxStart=i;
                }
   
            }
        }
        return s.substring(maxStart,maxStart+maxSize+1);
    }
}

