 public int XXX(String haystack, String needle) {
   if(haystack==null||needle==null||haystack.length()<needle.length()){       
        return -1;
    }
    char[] h_arr = haystack.toCharArray();
    char[] n_arr = needle.toCharArray();
    return match(h_arr,n_arr);
}
private int match(char[] h, char[] n){
   int i=0;
   int j=0;
   int posi =0;
   while(i<h.length&&j<n.length){
       if(h[i]==n[j]){
           i++;
           j++;
         
       }else{
           i = i-j+1;
           j = 0;
       }
   }
   //在这里可以>=n.length
       if(j==n.length){
       posi = i-n.length;
      
   }else{
       posi = -1;
   }

    return posi;
}

