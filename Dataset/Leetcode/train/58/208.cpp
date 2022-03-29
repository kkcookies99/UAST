 class Solution {
public:
    int XXX(string s) {
        int size=s.size();
        if(size==0)
            return 0;
        int result=0;
        for(int i=size-1;i>=0;--i)
        {
            if(s[i]!=' ')
            {
                ++result;
                for(int j=i-1;j>=0;--j)
                {
                    if(s[j]!=' ')
                        ++result;
                    else
                        break;
                    
                }
                return result;
            }
                
            
            
            
        }
        return result;
    }
};

