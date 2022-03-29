class Solution {
public:
    int XXX(int x) {
        if(x == 0){
            return 0;
        }else{
            if(x > 0){
                vector<int> v;
                while(x != 0){
                    v.push_back(x % 10);
                    x /= 10;
                }
                std::XXX(v.begin(),v.end());
                long re = 0;
                for(int i = 0; i < v.size(); i++){
                    re += (v[i] * pow(10,i));
                }
                int a = int(re);
                if(a == re){
                    return re;
                }else{
                    return 0;
                }
            }else{
                vector<int> v;
                while(x != 0){
                    v.push_back(-1 * (x % (10)));
                    x /= (10);
                }
                std::XXX(v.begin(),v.end());
                long re = 0;
                for(int i = 0; i < v.size(); i++){
                    re += (v[i] * pow(10,i));
                }
                int a = int(re);
                if(a == re){
                    return -1 * re;
                }else{
                    return 0;
                }
            }
        }
    }
};

