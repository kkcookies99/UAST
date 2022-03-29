 class Solution {
    public int XXX(String s) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        StringBuilder sb=new StringBuilder();
        int k=0;
        boolean isF=false;
        long ans=0;
        for(int i=0;i<n;i++){
           if(arr[i]!=' '){
               if(k==0&&(arr[i]=='-'||arr[i]=='+')){
                   k++;
                   if(arr[i]=='-'){
                       isF=true;
                   }
               }else{
                   if(arr[i]>='0'&&arr[i]<='9'){
                       sb.append(arr[i]);
                       k++;
                       long cur=Long.parseLong(sb.toString());
                       if(cur>Integer.MAX_VALUE){
                           if(isF){
                               return Integer.MIN_VALUE;
                           }else{
                               return Integer.MAX_VALUE;
                           }
                       } 
                   }else{
                       break;
                   }
               }

           }else{
               if(k>0){
                   break;
               }
           }
        }
        if(sb.length()==0)return 0;
        ans=Long.parseLong(sb.toString());
        if(isF){
            ans=-ans;
        }
        return (int)ans;
      
    }
}

