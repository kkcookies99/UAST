 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> result;
        map<int, int> l;
        for (auto i : intervals) {
            if (l.find(i[0]) == l.end()) {
                l[i[0]] = i[1];
            }
            else {
                if (l[i[0]] < i[1]) {
                    l[i[0]] = i[1];
                }
            }
        }
        bool first = true;
        int left = 0;
        int right = 0;
        vector<int> temp;
        for (auto ll : l) {
            if (first) {
                first = false;
                left = ll.first;
                right = ll.second;
                continue;
            }
            if (ll.first <= right ) {
                if (ll.second >= right) {
                    right = ll.second;
                }
            }
            else {
                temp.clear();
                temp.push_back(left);
                temp.push_back(right);
                result.push_back(temp);
                left = ll.first;
                right = ll.second;
            }
        }
        temp.clear();
        temp.push_back(left);
        temp.push_back(right);
        result.push_back(temp);

        return result;

    }
};