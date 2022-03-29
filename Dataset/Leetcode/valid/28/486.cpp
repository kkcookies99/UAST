 class Solution {
public:
    int XXX(string haystack, string needle) {
        int n1=haystack.size();
        int n2=needle.size();
        if(n2==0){
            return 0;
        }
        if(n1<n2){
            return -1;
        }
        vector<int> next(n2);  //字符串从0存储，next大小为n，从1存储，next大小为n+1
        getnext(next,needle);
        int j=0,k=0;
        while(j<n1){
            if(k==-1 || haystack[j]==needle[k]){
                j++;
                k++;
            }else{
                k=next[k];
            }
            if(k==n2){
                return j-n2;
            }
        }
        return -1;
    }
    void getnext(vector<int> &next,string needle){
        int j=0;
        int k=-1;
        next[j]=k;
        int n = needle.size();
        while(j<n-1){ //注意不能越界
            if(k==-1 || needle[j]==needle[k]){
                k++;
                j++;
                next[j]=k;
            }else{
                k=next[k];
            }
        }
    }
};

