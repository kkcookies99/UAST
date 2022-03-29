 class Solution {
public:
    string XXX(string a, string b) {
        int index1 = a.size() - 1;
        int index2 = b.size() - 1;
        string result;
        int index = 0;//表示进位
        while (index1 >= 0 && index2 >= 0) {
            if (a[index1] == '1' && b[index2] == '1') {
                if (index == 1)
                    result.insert(result.begin(),'1');
                else
                    result.insert(result.begin(),'0');
                index = 1;
            } else if (a[index1] == '1' && b[index2] == '0' || a[index1] == '0' && b[index2] == '1') {
                if (index == 1) {
                    result.insert(result.begin(),'0');
                    index = 1;
                } else {
                    result.insert(result.begin(),'1');
                    index = 0;
                }
            } else {
                if (index == 1) {
                    result.insert(result.begin(),'1');
                    index = 0;
                } else {
                    result.insert(result.begin(),'0');
                    index = 0;
                }
            }
            --index1,--index2;
        }
        if (index1 < 0) {
            while (index2 >= 0) {
                if (index == 1) {
                    if (b[index2] == '1') {
                        result.insert(result.begin(), '0');
                        index = 1;
                    } else {
                        result.insert(result.begin(), '1');
                        index = 0;
                    }
                } else {
                    result.insert(result.begin(), b[index2]);
                    index = 0;
                }
                --index2;
            }
        } else if (index2 < 0) {
                while (index1 >= 0) {
                    if (index == 1) {
                        if (a[index1] == '1') {
                            result.insert(result.begin(), '0');
                            index = 1;
                        } else {
                            result.insert(result.begin(), '1');
                            index = 0;
                        }
                    } else {
                        result.insert(result.begin(), a[index1]);
                        index = 0;
                    }
                    --index1;
            }
        }

        if (index  == 1) {
            result.insert(result.begin(),'1');
        }

        return result;
    }
};

