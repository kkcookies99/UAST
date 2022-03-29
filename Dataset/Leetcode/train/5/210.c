 char * XXX(char * s)
{
   assert(s!=NULL);
   int len=strlen(s);
   if(len<2)//1个
   {
       return s;//直接返回
   }
   int maxlen=0;//记录最长的长度
   int begin=0;//记录起始位置
   int end=0;//记录最终位置
   for(int i=0;i<len-1;i++)
   {
       for(int j=i+1;j<len;j++)
       {
           //有回文串并且这个新的回文串比之前的更长
           if(j-i+1>maxlen&&ISPalindrome(s,i,j)==1)
           {
                maxlen=j-i+1;
                end=j-i;
                begin=i;
           }
       }
   }
   s[begin+end+1]='\0';
   return s+begin;
}

