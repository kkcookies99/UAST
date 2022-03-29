 class Solution {
public:
    int XXX(string haystack, string needle) {
        //if(needle=='') return 0;
        if(needle=="") return 0;
        if(haystack.size()<needle.size()) return-1;        
        for(int i=0;i<=haystack.size()-needle.size();i++){
            if(needle[0]==haystack[i]){
                bool a=true;
                for(int j=1;j<needle.size();j++){
                    if (needle[j]!=haystack[i+j])
                        a=false;               
                    }
                if (a==true) return i;
                }
            }
            return -1;
    }
};

