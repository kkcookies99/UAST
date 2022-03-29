 class Solution {
public:
    int XXX(string haystack, string needle) {
        int n = needle.size();
        if(n==0) return 0;
        int n1 = haystack.size();
        int next[n+1];
        int j=1,i=0;
        get_next(needle,next,n);
        get_valnext(needle,next,n);
        //for(int i =0;i<n+1;i++)
        //cout<<next[i]<<endl;
        while(i<n1&&j<=n){
            
            if(j==0||haystack[i]==needle[j-1]){
                j++;
                i++;
            }
            else j=next[j];
        }
        //cout<<i<<n<<endl;
        if(j==n+1) return i-n;
        else return -1;
    }

    void get_next(string needle,int next[],int length){
        if(length==1) {
            next[0] =-1;
            return ;
        }
        next[0]=-1;
        next[1] =0;
        next[2] = 1;
        int i=2,j=1;//j代表要匹配的位置，i代表next数组最后位置
        while(i<length){
            if(j==0||needle[i-1]==needle[j-1]){
                //j==0代表没有一个前后缀可以匹配,j!=0代表比之前的next多一位。
                i++;
                j++;
                next[i]=j;
                
            }
            else j=next[j];//最后一项不匹配，后缀当作主串，前缀当成模块串，继续匹配。
        }
    }


    void get_valnext(string needle,int next[],int length){
        if(length==1) return ;
        for(int i = 1; i <length;i++){
            if(needle[i]==needle[next[i+1]-1]) next[i+1]=next[next[i+1]];
        }
    }
 
    
};

