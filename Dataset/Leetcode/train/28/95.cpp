 class Solution {
public:
    int XXX(string haystack, string needle) {
        int i=0;
        int m=haystack.size();
        int n=needle.size();
        if(m==0&&n!=0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        for(i=0;i<m-n+1;i++)
        {
            int x,y,turn=1;
            for(x=i,y=0;x<m&&y<n;x++,y++){
                if(haystack[x]!=needle[y]){
                    turn=-1;
                    break;
                }
            }
            if(turn==1&&y==n){
                return i;
            }

        }
        return -1;

    }
};

