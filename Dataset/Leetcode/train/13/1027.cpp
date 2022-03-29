 class Solution {
public:
    int XXX(string s) {
        unordered_map<string,int> umap;
        umap["I"]=1;
        umap["V"]=5;
        umap["X"]=10;
        umap["L"]=50;
        umap["C"]=100;
        umap["D"]=500;
        umap["M"]=1000;

        umap["IV"]=4;
        umap["IX"]=9;
        umap["XL"]=40;
        umap["XC"]=90;
        umap["CD"]=400;
        umap["CM"]=900;
        int n=s.size();
        int i=0;
        int ans=0;
        while(i<n){
            if(s[i]=='I'||s[i]=='X'||s[i]=='C'){
                if(umap.count(s.substr(i,2))){
                    ans+=umap[s.substr(i,2)];
                    i+=2;
                }
                else{    
                    ans+=umap[s.substr(i,1)];
                    i+=1;
                }
            }
            else{
                ans+=umap[s.substr(i,1)];
                i+=1;
            }
        }
        return ans;
    }
};

