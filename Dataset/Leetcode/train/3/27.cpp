 class Solution {
public:
   // 双指针比较法
    int XXX(string s) {
        int i = 0,j,k,max = 0,len;
        for(j=i;j<s.size();j++){
            for(k=i;k<j;k++){
                if(s[k]==s[j]){
                    len = j-i;
                    if(len > max) max =len;
                    i = k+1;
                    break;
                }
            }
        }
        return j-i>max?j-i:max;
    }
};

