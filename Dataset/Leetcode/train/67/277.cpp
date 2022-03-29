 class Solution {
public:
    string XXX(string a, string b) {
        int lena=a.length(),lenb=b.length();
        int carry=0;
        string c="";
        if(lena<lenb){
            for(int i=0;i<lenb-lena;i++){
                a='0'+a;
            }
        }
        else{
            for(int i=0;i<lena-lenb;i++){
                b='0'+b;
            }
        }
        for(int i=a.length()-1;i>=0;i--){
            int sum=carry+int(a[i]-'0')+int(b[i]-'0');
            c=to_string(sum%2)+c;
            carry=sum/2;
        }
        if(carry>0){
            c=to_string(carry)+c;
        }
        return c;
    }
};

