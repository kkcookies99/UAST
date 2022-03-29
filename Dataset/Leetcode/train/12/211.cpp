 class Solution {
public:
    map<int,string> normal;
    void init(){
        normal.insert(make_pair(1,"I"));
        normal.insert(make_pair(5,"V"));
        normal.insert(make_pair(10,"X"));
        normal.insert(make_pair(50,"L"));
        normal.insert(make_pair(100,"C"));
        normal.insert(make_pair(500,"D"));
        normal.insert(make_pair(1000,"M"));
        normal.insert(make_pair(4,"IV"));
        normal.insert(make_pair(9,"IX"));
        normal.insert(make_pair(40,"XL"));
        normal.insert(make_pair(90,"XC"));
        normal.insert(make_pair(400,"CD"));
        normal.insert(make_pair(900,"CM"));
    }
    string XXX(int num) {
        string res="";
        vector<int> arr{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        init();
        while(num){
            for(int i=arr.size()-1;i>=0;i--){
                while(num>=arr[i]){
                    res+=normal[arr[i]];
                    num=num-arr[i];
                }               
            }
        }
        return res;
    }
};

