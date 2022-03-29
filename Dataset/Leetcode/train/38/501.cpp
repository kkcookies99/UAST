 class Solution {
public:
    string XXX(int n) {
        vector<string> str(n);
        str[0]="1";
        for(int i=1;i<n;i++){
            int count=0;
            char num='a';
            for(int j=0;j<str[i-1].size();j++){
                if(num=='a'){
                    count=1;
                    num=str[i-1][j];
                }
                if(j==str[i-1].size()-1){
                        str[i]+=count+'0';
                        str[i]+=num;
                    }
                    else if(str[i-1][j]==str[i-1][j+1]){
                        count++;
                    }
                    else{
                        str[i]+=count+'0';
                        str[i]+=num;
                        num='a';
                        count=0;
                    }
                
            }
            
        }
        return str[n-1];
    }
};

