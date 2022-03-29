 class Solution {
public:
    int XXX(string haystack, string needle) {
        for(int i=0; i< haystack.size(); i++){
            int temp = i;
            if(haystack.size() - temp< needle.size())
                    return -1;
            for(int j=0; j< needle.size(); j++, temp++){
                if(haystack[temp] != needle[j])
                    break;
            }
            if(temp - i == needle.size())
                return i;
        }
        return haystack.size() == 0&& needle.size()== 0? 0: -1;
    }
};

