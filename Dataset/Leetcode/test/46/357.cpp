class Solution {
public:
vector<vector<int>>ans;
        vector<int>tmp;
        vector<pair<int,int>>vv;
           void dfs(vector<pair<int,int>>&v,int i){ 
            if(v[i].second!=0){ return;}  
                 tmp.push_back(v[i].first);  
                 ++v[i].second; 
           if(tmp.size()==v.size()){   
               ans.push_back(tmp);   
              }  
               for(int j=0;j<v.size();++j){    
                   dfs(v,j); 
               }  
                 --v[i].second;
                 tmp.pop_back();
           } 
    vector<vector<int>> XXX(vector<int>& v) {
        int n=v.size()-1;
        for(int i=0;i<=n;++i){
               vv.push_back({v[i],0});
        }
         for(int i=0;i<=n;++i){
             dfs(vv,i);
         }
            
              return ans;

    }
};

