 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(!needle.size())return 0;
        if(!haystack.size())return -1;
        int count = 0;
        int temp = 0;
        while(temp < needle.size())
        {   
            if(haystack.size()<needle.size())return count = -1;
            if(haystack[temp] != needle[temp])
            {
            haystack = haystack.erase(0,1);
            count++;
            temp =0;
            }
            else  temp++; 
        }
        return count;
    }
};

