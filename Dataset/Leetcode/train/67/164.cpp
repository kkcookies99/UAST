 class Solution {
public:
    string XXX(string a, string b) {
        if(a.size()==0) return b;
        if(b.size()==0) return a;
        reverse(a);
        reverse(b);

        string res = "";
        int a_left = 0;
        int b_left = 0;

        while(a_left<a.size()&&b_left<b.size()){
            char temp = '0' + a[a_left]-'0'+b[b_left]-'0';
            res+=temp;
            a_left++;
            b_left++;
        }

        while(a_left<a.size()){
            char temp = a[a_left];
            res+=temp;
            a_left++;
        }

        while(b_left<b.size()){
            char temp = b[b_left];
            res+=temp;
            b_left++;
        }

        int flag = 0;
        int cur =0;
        while(cur<res.size()){
            if(flag){
                res[cur]++;
                flag = 0;
            }
            if(res[cur]>'1'){
                res[cur]-=2;
                flag = 1;
            }
            cur++;
        }
        if(flag==1){
            res+='1';
        }

        reverse(res);
        return res;
    }

    void reverse(string& str){
        int left =0;
        int right =str.size()-1;
        while(left<right){
            swap(str[left],str[right]);
            left++;
            right--;
        }


    }
}

