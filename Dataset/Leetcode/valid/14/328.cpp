 class Solution {
public:
    string XXX(vector<string>& strs) 
    {
      if(strs.empty())
        return"";
      int flag=1;
      int j,i;
      string same;
      int minlength=strs[0].length();
      for( i=1;i<strs.size();i++)
     {
        if(strs[i].length()<minlength)
            minlength=strs[i].length();
     }
      for( j=0;j<minlength;j++)
      {
        for(i=1;i<strs.size();i++)
        {
            if(strs[i][j]!=strs[0][j])
                {
                    flag=0;
                    break;
                }
        }
        if (flag==1){
            same+=strs[0][j];
        }
        else
            break;
     }
     return same;
        
    }
};

