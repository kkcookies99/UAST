 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle.size()==0) return 0;
        if(haystack.size()==0) return -1;
        int i=0,j=0;
        while(i<haystack.size()&&j<needle.size()){
            if(haystack[i]==needle[j]){
                j++;
                i++;
            }else{
                i-=(j-1);
                j=0;
            }
            //cout<<i<<" "<<j<<endl;
        }
        if(j==needle.size()){
            return i-needle.size();
        }
        return -1;
    }
};

