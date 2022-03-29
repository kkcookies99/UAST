 class Solution {
public:
    string XXX(vector<string>& strs) {
        int i;
        int b ;
        string a= "";
        int j = strs.size();
        if ( j ==0) return a;
        if (j == 1) return strs[0];
        for ( i=0;i<strs[0].size();i++)
        {
            for (int k = 1; k<j;k++)
            { 
                if (strs[0][i] == strs[k][i]) 
                {
                    b = 1;
                
                }
                   
                else 
                {
                    b =0;
                    break;   
                }
              
            }
            if (b == 1)
            {
                a.push_back( strs[0][i]);
            }
            else
            {
                break;
            }
        }
        return a;
    }
};

