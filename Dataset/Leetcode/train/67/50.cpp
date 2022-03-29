 class Solution {
public:
    string XXX(string a, string b) {
        int carry = 0;
        string longer, shorter;
        
        if(a.size()>=b.size()){
            longer = a;
            shorter = b;
        }
        else{
            longer = b;
            shorter = a;
        }

        int longerSize = longer.size()-1;
        int shorterSize = shorter.size()-1;
        int i=0;

        for(;i<=shorterSize;i++){
            int result = carry + (shorter[shorterSize-i]-'0') + (longer[longerSize-i]-'0');
            longer[longerSize-i] = '0' + result%2;
            carry = result/2;
        }

        for(;i<=longerSize && carry==1; i++){
            int result = carry + (longer[longerSize-i]-'0');
            longer[longerSize-i] = '0' + result%2;
            carry = result/2;
        }

        if(carry==1){
            longer.insert(longer.begin(), '1');
        }

        return longer;

    }
};

