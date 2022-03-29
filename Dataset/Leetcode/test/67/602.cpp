class Solution {
public:
    string XXX(string a, string b) {
        vector<int> A, B;
        for (char &c : a) A.push_back(int(c - '0'));
        for (char &c : b) B.push_back(int(c - '0'));

        vector<int> C;
        if (greater(A, B))
            add(A, B, C);
        else 
            add(B, A, C);

        string ans;
        for (int &c : C) ans += to_string(c);
        return ans;
    }

    // return ture if A is greater than B
    bool greater(vector<int>& A, vector<int>& B) {
        int sa = A.size(), sb = B.size();
        if (sa < sb) return false;
        if (sa > sb) return true;

        for (int i = 0; i < sa; ++i) {
            if (A[i] < B[i]) return false;
        }
        return true;
    }

    // A is greater than B and C = A + B
    void add(vector<int>& A, vector<int>& B, vector<int>& C) {
        int sa = A.size(), sb = B.size();
        reverse(A.begin(), A.end());
        reverse(B.begin(), B.end());

        C.clear();
        int carry = 0, sum = 0, i = 0;
        while (i < sa && i < sb) {
            sum = A[i] + B[i] + carry;
            carry = sum / 2;
            C.push_back(sum % 2);
            i++;
        }
        while (i < sa) {
            sum = A[i] + carry;
            carry = sum / 2;
            C.push_back(sum % 2);
            i++;
        }
        if (carry > 0) C.push_back(carry);

        reverse(A.begin(), A.end());
        reverse(B.begin(), B.end());
        reverse(C.begin(), C.end());
    }
};


