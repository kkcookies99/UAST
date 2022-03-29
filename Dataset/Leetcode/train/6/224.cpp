 class Solution {
public:
    string XXX(string s, int numRows) {
    int len = s.length();

    if(numRows == 1){
        return s;
    }

    int root = 0;
    string ans;
    int total = (numRows-1)*2;
    int space = total;

    while (root<numRows)
    {
        int posi = root;
        while (posi < len)
        {
            ans.push_back(s[posi]);
            posi += space;
            
            if(space < total){
                if(space == 0){
                    posi += total;
                    continue;
                }

                if(posi < len){
                    ans.push_back(s[posi]);
                }else
                {
                    break;
                }
                posi += total - space;
                if(posi < len){
                    continue;
                }else{
                    break;
                }

            }
        }
        
        space-=2;
        root++;
    }
    return ans;
    }
};

