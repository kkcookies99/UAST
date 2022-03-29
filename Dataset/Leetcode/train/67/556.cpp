class Solution {
public:
    string XXX(string a, string b) {
        string res="";
        int carry=0;
        int i = a.length()-1;
        int j=b.length()-1;
        while(i>=0 || j>=0){
            int tmp=carry;
            if(i>=0)
                tmp += a[i--]=='1'?1:0;
            if(j>=0)
                tmp += b[j--]=='1'?1:0;
            res.insert(0,tmp%2?"1":"0");
            carry = tmp/2;
        }
        if(carry)
            res.insert(0,carry%2?"1":"0");
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


