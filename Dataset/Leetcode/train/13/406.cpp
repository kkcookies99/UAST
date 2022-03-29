 class Solution {
public:
    int XXX(string s) {
        map<string,int> hashmp;
        hashmp["I"]=1;
        hashmp["V"]=5;
        hashmp["X"]=10;
        hashmp["L"]=50;
        hashmp["C"]=100;
        hashmp["D"]=500;
        hashmp["M"]=1000;
        hashmp["IV"]=4;
        hashmp["IX"]=9;
        hashmp["XL"]=40;
        hashmp["XC"]=90;
        hashmp["CD"]=400;
        hashmp["CM"]=900;
        int n=s.size();
        int res=0;
        for(int i=0;i<n;i++){
            string cur{s[i]};
            if(cur=="I"){
                if(i+1<n){
                    if(s[i+1]=='V'){
                        res+=4;
                        i++;
                        continue;
                    }
                    if(s[i+1]=='X'){
                        res+=9;
                        i++;
                        continue;
                    }
                }
            }else if(cur=="X"){
                if(i+1<n){
                    if(s[i+1]=='L'){
                        res+=40;
                        i++;
                        continue;
                    }
                    if(s[i+1]=='C'){
                        res+=90;
                        i++;
                        continue;
                    }
                }
            }else if(cur=="C"){
                if(i+1<n){
                    if(s[i+1]=='D'){
                        res+=400;
                        i++;
                        continue;
                    }
                    if(s[i+1]=='M'){
                        res+=900;
                        i++;
                        continue;
                    }
                }
            }
            res+=hashmp[cur];
        }
        return res;
    }
};

