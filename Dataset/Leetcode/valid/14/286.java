 class Solution {
    public String XXX(String[] strs) {
        int shortestStrIndex=findShortest(strs);
        String shortestStr=strs[shortestStrIndex];
        String result="";
        for(int i=1;i<=shortestStr.length();i++){
            String temp=shortestStr.substring(0,i);
            if(isMatch(strs,shortestStrIndex,temp))result=temp;
        }
        return result;
    }
    public static boolean isMatch(String[] strs,int delIndex,String matchStr){
        int count=0;
        for(int i=0;i<strs.length;i++){
            if(i==delIndex){count++;continue;}
            if(strs[i].indexOf(matchStr)!=0)break;count++;
        }
        return count==strs.length;
    }
    public static int findShortest(String[] strs){
        int minLength=strs[0].length();
        int min=0;
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<minLength){
                minLength=strs[i].length();
                min=i;
            }
        }
        return min;
    }
}

