 int XXX(char * haystack, char * needle){
    //滑动窗口
    //滑动窗口
    //滑动窗口
    //滑动窗口
    //滑动窗口
    //滑动窗口
    //滑动窗口
   char *s = haystack;
   char *p = needle;
   int n = strlen(s);
   int len = strlen(p);
   int need[128] = {0};
   int have[128]= {0};
   if(len == 0) return 0;
   if(len>n) return -1;
   for(int i = 0;i<len;i++)
   {
       need[p[i]]++;
   }
   int right = 0,left = 0;
   int count = 0;
   while(right<n)
   {
       char r = s[right];
       if(need[r]>0)
       { 
           have[r]++;
           if(have[r]<=need[r])
           {
               count++;//有效字母!;
           }
           
       }
      
       right++;
       while(count==len)
       {
           //fun //此处注意  虽然长度一样 但是有这种 piip ip 则返回0就错了 顺序也得考虑;
           if(len==right-left)
           {
               int k = 0,flag = 1;
               for(int j = left;j<left+len;j++)
               {
                   if(s[j]!=p[k++])
                   {
                        flag = -1;
                        break;
                   }
               }
              if(flag==1) return left;
           }
           char l = s[left];
           if(need[l]>0)
           {
               have[l]--;
               if(have[l]<need[l]) count--;
           }
           
           left++;
       }
       

   }
   return -1;
   
    
}

