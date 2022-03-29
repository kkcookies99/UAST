 class Solution {
public:
    int XXX(string s) {
    auto iter=find_if(s.rbegin(),s.rend(),[](char& c){
        return c!=' ';
    });
    auto iter1 =find_if(iter, s.rend(),[](char& c){
        return c==' ';
    });
    return distance(iter, iter1);
    }
};

