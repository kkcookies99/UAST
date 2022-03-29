 class Solution {
public:
    /*int XXX(string s) {  //之前的代码,复杂度O(n^2)
        int  size,i=0,j,k,max=0;
        size = s.size();
        for(j = 0;j<size;j++){
            for(k = i;k<j;k++)
                if(s[k]==s[j]){
                    i = k+1;
                    break;
                }
            if(j-i+1 > max)
                max = j-i+1;
        }
        return max;
    }*/
    int hashmap[130];
    int XXX(string s) { //双指针滑动窗口
        int max=0;
        int n = s.size();
        for(int i=0,j=0;j<n;j++){//当前判断是否重复的串为s[i..j]
            hashmap[s[j]]++;
            while(hashmap[s[j]]>1){
                hashmap[s[i++]]--;  //i指针右移
            }
            if(j-i+1>max)
                max = j-i+1;
        }
        return max;
    }
};

