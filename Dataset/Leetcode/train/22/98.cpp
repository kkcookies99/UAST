 class Solution {
public:
    vector<string> results;
    void reverse(int left,int right,string tmp,int n) {
        if(left < right) {
            return ;
        }
        
        
        if(tmp.size()==n) {
            if(left == right)
            {
                results.push_back(tmp);
            }
            return;
        }

        reverse(left+1,right,tmp+"(",n);
        reverse(left,right+1,tmp+")",n);
  
        
        
    }
    
    vector<string> XXX(int n) {
        string empty = "";
        reverse(0,0,empty,n*2);
        return results;
    }
};

