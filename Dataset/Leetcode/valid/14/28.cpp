 class Solution {
public:
    string XXX(vector<string>& strs) {
        string s;
        bool falg = true;
        for(int i =0 ;i<strs[0].size();i++)
        {
            for(int j = 0;j<strs.size();j++)
            {
              if(strs[j][i] !=strs[0][i])
              {
                  falg = false;
              }  
            }
            if(falg)
            {
                 s.push_back(strs[0][i]);
            }
            else{
              if(!i)
              {return "";}
          }
        }
        return s;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

