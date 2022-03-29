 class Solution {
public:
    string XXX(vector<string>& strs) {
      int n=strs.size();
      int minl=strs[0].size();
      int k=0;
      bool flag=true;
      for(int i=1;i<n;i++){
          if(strs[i].size()<minl) minl=strs[i].size();
      }
      for(int j=0;j<minl;j++){
        for(int i=0;i<n-1;i++){
            if(strs[i][j]==strs[i+1][j]) {flag=true;}
            else{flag=false;break;}
        }
        //flag==true?k++:break; 为什么这种表达不对啊
        if(flag==true)
        {k++;}
        else{break;}
      }
      return strs[0].substr(0,k);
    }
};

