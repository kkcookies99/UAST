 class Solution {
public:
    string XXX(int num) {
        int i;
        string r="", s="IVXLCDM";
        vector<int> v;
        while(num>0){
            v.push_back(num%10);
            num/=10;
        }
        for(i=v.size()-1; i>=0; i-- ){
            switch(v[i]){
                case 4:
                    if(i==0) r+="IV";
                    else if(i==1) r+="XL";
                    else r+="CD";
                    break;
                case 9:
                    if(i==0) r+="IX";
                    else if(i==1) r+="XC";
                    else r+="CM";
                    break;
                default:
                    int t=v[i];
                    if(t<5){
                        while(t>0){
                            r+=s[2*i];
                            t--;
                        }
                    }else{
                        if(i==0) r+="V";
                        else if(i==1) r+="L";
                        else r+="D";
                        if(t>5){
                            t-=5;
                            while(t>0){
                                r+=s[2*i];
                                t--;
                            }
                        }
                    } 
                    break;
            }
        }
        return r;
    }
};

