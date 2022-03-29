 class Solution {
public:
    int XXX(int x) {
        int pos = 0;
        string max;
        string x_str;
        string temp;
        istringstream iss;
        ostringstream oss;
    
        oss << INT_MAX;
        max = oss.str();
        oss.str("");

        oss << x;
        x_str = oss.str();
        if (x < 0) pos++;
        std::XXX(x_str.begin() + pos, x_str.end());
        temp = x_str.substr(pos);
        if (temp.length() == max.length() && temp > max) return 0;
        iss.str(x_str);
        iss >> x;
        return x;
    }
};

