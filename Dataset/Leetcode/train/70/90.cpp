class Solution {
    int m[2]={2,1};
public:
    int XXX(int n) {
        switch(n){
            case 1:return 1;
            case 2:return 2;
            default:
                for(int i =3;i<n;i++)
                {
                    m[i%2]=m[0]+m[1];
                }
                return m[0]+m[1];
        }
    }
};

