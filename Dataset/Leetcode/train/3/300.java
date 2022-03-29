 class Solution {
    public int XXX(String s) {
        int[] hash = new int[129];
     int i = 0,start = 0,max =1;
        if(s.isEmpty()){
            return 0;
        }
     while(start < s.length() && i< s.length()){
        if(hash[s.charAt(start)]==0){
            hash[s.charAt(start)]=1;
            if(start - i +1 > max) max = start -i +1;
            start++;
        }else{
            hash[s.charAt(i)] =0;
            i++;
        }
     }
     return max;
    }
}

