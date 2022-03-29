 class Solution {
public:
    string XXX(string a, string b) {
        int i=a.length()-1,j=b.length()-1;
        int rear=a.length()>b.length()?a.length():b.length();
        string result="";
        int digit=0;
        while(i>=0&&j>=0)
        {
            int temp=a[i]-'0'+(b[j]-'0')+digit;
            if(temp>=2) digit=1;
            else digit=0;
            result+='0'+temp%2;
            i--;
            j--;
        }
        if(i>=0){
            b=a;
            j=i;
        }
        while(j>=0){
            int temp=b[j]-'0'+digit;
            if(temp>=2) digit=1;
            else digit=0;
            result+='0'+temp%2;
            j--;
        }
        if(digit) result+='0'+digit;
        reverse(result.begin(),result.end());
        return result;
    }
};

