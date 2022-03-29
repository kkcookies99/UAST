class Solution {
public:
    string XXX(string a, string b) {
        string ans;
        int i=a.size()-1;
        int j=b.size()-1;
        int jinwei=0;
        while(i>=0||j>=0||jinwei>0){
            int numa=0;
            int numb=0;
            if(i>=0){
                numa=a[i]-'0';
                i--;
            }
            if(j>=0){
                numb=b[j]-'0';
                j--;
            }
            int tmp=numa^numb^jinwei;
            if((numa==1&&numb==1)||(jinwei==1&&numa==1)||(jinwei==1&&numb==1))
                jinwei=1;
            else
                jinwei=0;
            ans+=to_string(tmp);
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
};

