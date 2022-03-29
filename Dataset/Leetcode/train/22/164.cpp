 class Solution {
public:
    vector<string> ans;

    vector<string> XXX(int n) {
              digui(n,n,"");
               return ans;
    }
    void digui(int left,int right,string temp)
    {
           if(left==0 && right ==0)
           {
               ans.push_back(temp);
               return;
           }
           else if(left==0 && right !=0)
           {
               
                digui(left,right-1,temp+')');
           }
            else if(left<right)
            {

                digui(left-1,right,temp+'(');
                digui(left,right-1,temp+')');
            }
            else if(left>=right)
            {
              
                digui(left-1,right,temp+'(');
            }
            
    }
};

