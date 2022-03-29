 class Solution {
     public int XXX(String str) {
        if(str.trim().equals("")) return 0;
        char[] result = str.toCharArray();
        int pos= 0,flag=1;
         String total = "0";long temp;
        while(pos < result.length){
            while(pos < result.length && result[pos]== ' '){
                pos++;
            };
           if(result[pos]=='-'){
               flag = -1;
              while(++pos <result.length && result[pos] <='9' && result[pos]>='0')
              {
                  total += result[pos];
                  temp = Long.valueOf(total);
                  if(temp > Integer.MAX_VALUE) return Integer.MIN_VALUE;
              }
              break;
           }else if(result[pos]=='+' || ((result[pos] <='9' && result[pos]>='0'))) {
               if(result[pos]=='+') pos++;
               while(pos <result.length && result[pos] <='9' && result[pos]>='0')
               {
                   total += result[pos];
                   temp = Long.valueOf(total);
                   if(temp >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
                   pos++;
               }
               break;
           }else{
               return 0;
           }
        }

        return Integer.parseInt(total)*flag;
    }

}```

