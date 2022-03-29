 class Solution {
public:
    string XXX(string a, string b) {
        string result; 
        int cur=0, c=0,i,j,f=0;
        for(i = a.size()-1 , j = b.size()-1; j>=0 || i>=0 ; j--,i--){
            int i1 = i>=0?a[i]-'0':0;
            int j1 = j>=0?b[j]-'0':0;
            c = i1+j1;
            int temp = i1 + j1 + cur ;
            f = cur;
            cur = 0;
            if(temp > 1) cur=1;
            if(temp == 2 || temp == 0)
                result.insert(result.begin(),'0');
            else
                result.insert(result.begin(),'1');
        }
        if(cur == 1)
            result.insert(result.begin(),'1');
        return result;
    }
};


