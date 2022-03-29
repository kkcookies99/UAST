 class Solution {
public:
    int XXX(string s) {
        int i = 0;
        while(s[i]==' ') i++;
        int op = 1;
        if(s[i]=='-'){
            op = -1;
            i++;
        }else if(s[i]=='+') i++;
        while (s[i]=='0') i++;
        if((int)s[i]-'0'<0||(int)s[i]-'0'>9) return 0;
        // return (int) s[i];

        vector<char> v;
        while(i<s.size() && (int)s[i]-'0'>=0 && (int)s[i]-'0'<=9) v.push_back(s[i++]);

        if(v.size()>10){
            if (op==1){
                return pow(2,31)-1;
            }else if(op==-1){
                return -pow(2,31);
            }
        }

        long long sum = 0;
        for(i=0;i<v.size();i++){
            sum = sum * 10 + (int) v[i]-'0';
        }
        if (op==1){
            if(sum>pow(2,31)-1) sum = pow(2,31)-1;
        }else if(op==-1){
            if(sum>pow(2,31)) sum = -pow(2,31);
            sum = -sum;
        }
        return sum;
    }
};

