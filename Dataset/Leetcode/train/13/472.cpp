 class Solution {
public:
    int values[14]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    string reps[14]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    int XXX(string s) {    
        int ans=0,i=0;
        while(i<s.size()){
            for(int j=0;j<14;j++){
                if(check(s,i,reps[j])){
                    i+=reps[j].size();
                    ans+=values[j];
                    break;
                }
            }
        }
        return ans;
    }
    bool check(string s,int i,string tar){
        int j=0;
        while(j<tar.size()&&i<s.size()){
            if(s[i]!=tar[j]){
                return false;
            }
            i++,j++;
        }
        return j==tar.size();
    }
};

