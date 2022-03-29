 class Solution {
public:
    string XXX(string s, int numRows) {
        char a[1000];
        strcpy(a,s.c_str());
        string ans = "";
        if(numRows == 1){
            ans = s;
        }else{
            for(int i = 0;i<numRows;i++){
                for(int j = 0;j*(2*numRows-2)<s.length()+2*numRows-2;j++){
                    if(i == 0 || i == numRows-1){
                        if(j*(2*numRows-2)+i < s.length()){
                            ans += a[j*(2*numRows-2)+i];  
                        }
                    }else{
                        if(j*(2*numRows-2)+i < s.length()){
                            ans += a[j*(2*numRows-2)+i];
                        }
                        if((j+1)*(2*numRows-2)-i < s.length()){
                            ans += a[(j+1)*(2*numRows-2)-i];
                        }
                    }
                
                } 
            }
        }

        return ans;
    }
};

