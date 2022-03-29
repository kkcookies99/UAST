class Solution {
public:
    //enum data {I=1, V=5, X=10, L=50, C=100, D=500, M=1000}a;
    int panduan(char num_data){
        switch (num_data){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    int XXX(string s) {
        char *kuai = const_cast<char*>(s.c_str()); 
        char *man = const_cast<char*>(s.c_str());
        int sum = 0;
        while(*kuai != NULL){
            kuai++;
            if(*kuai == '\0'){
                sum += panduan(*man);
                break;
            }

            if((*kuai == 'D'&&*man == 'C')||(*kuai == 'M'&&*man == 'C')||(*kuai == 'L'&&*man == 'X')||(*kuai == 'C'&&*man == 'X')||(*kuai == 'V'&&*man == 'I')||(*kuai == 'X'&&*man == 'I')){
                sum += panduan(*kuai) - panduan(*man);
                kuai++;
                man++;
                man++;
                continue;
            }
            sum += panduan(*man);
            man++;
        }
        return sum;
    }
};

