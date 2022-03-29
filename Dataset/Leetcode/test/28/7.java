 class Solution {
    public int XXX(String haystack, String needle) {
        int res=0;
        char [] text=haystack.toCharArray();
        char [] pattern=needle.toCharArray();
        if (needle.length()==0){
            return 0;
        }
        res=Kmp_search(text,pattern);
        return res;
    }

    public void next_table(char [] pattern,int [] next,int n){
        next[0]=0;
        int len=0;
        int i=1;
        while (i<n){
           if (pattern[i]==pattern[len]){
               len++;
               next[i]=len;
               i++;
           }else {
               if (len>0){
                   len=next[len-1];
               }else {
                   next[i]=len;
                   i++;
               }
           }
        }

    }
    public  void mov_next(int [] next,int n){
        for (int i=n-1;i>0;i--){
            next[i] = next[i-1];
        }
        next[0]=-1;
    }

    public int Kmp_search(char [] text,char [] pattern){
        int n=pattern.length;
        int m=text.length;
        int [] next=new int[n];
        int res=-1;
        next_table(pattern,next,n);
        mov_next(next,n);//得到处理后的next数组

        int j=0,i=0;
        while (i<m){
            if (j==n-1 && text[i]==pattern[j]){
                res=i-j;
                j=next[j];
                return res;
            }
            if (text[i]==pattern[j]){
                i++;j++;
            }else {
                j=next[j];
                if (j==-1){
                    i++;
                    j++;
                }
            }
        }
     return res;

    }
}


