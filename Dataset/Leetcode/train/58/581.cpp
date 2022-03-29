class Solution {
public:
    int XXX(string s) {
        stringstream ss(s);
        string item;
        vector<string> vec;
        while(getline(ss, item, ' ')) {
            if(item.empty())
                continue;

            vec.push_back(item);
        }

        return vec[vec.size() - 1].length();
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


