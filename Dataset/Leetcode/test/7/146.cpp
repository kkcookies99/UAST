class Solution {
public:
    int XXX(int x) {
        if(x<-2147483648 || x>2147483647){
            return 0;
        }
        else
        {
            int num;
            string numstr;
            ostringstream oss;
            int temp=fabs(x);
            while(temp>=10){
                oss<<numstr<<temp%10;
                temp=temp/10;
            }
            oss<<numstr<<temp;
            stringstream ss(oss.str());
            ss>>num;
            if(x<0){
                return -num;
            }
                return num;
        }
    }
};

