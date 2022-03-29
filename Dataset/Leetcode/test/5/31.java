 class Solution {
    public String XXX(String s) {
                //1.暴力搜索
                   int len =s.length();
                   if(len<2){
                       return s;
                   }
                   //子串只需要知道起始索引和总长度即可
                   int maxlen =1;
                   int beginindex=0;

                   //将字符串转变为字符数组
                   char[] sChar = s.toCharArray();
                  // 枚举所有长度严格大于1的子串
                for (int i = 0; i < len-1; i++) {
                    for (int j = i+1; j <len; j++) {
                         // 判断是否为回文串
                         if(vaildline(sChar,i,j)){
                             // 如果是，则更新最大的长度 和初始索引
                             maxlen = Math.max(maxlen,j-i+1);
                             beginindex = i;
                         } // 如果不是，则继续遍历
                    }
                }
               return s.substring(beginindex,beginindex+maxlen-1);
        }
        // 判断回文串的方法
        private boolean vaildline(char[]arr,int left,int right){
                //判断回文串方法：首尾是否相等
        //    while(left<right){
                 if(arr[left] != arr[right]){
                     return false;
                 }else{
                      return true;
                 }
                 //如果不相等，则左边的索引+1；右边的索引-1
                // left++;
                // right--; 
            // }
           
        }
    }

