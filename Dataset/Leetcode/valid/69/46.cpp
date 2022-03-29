class Solution {
public:
    int XXX(int x) {
        if (x < 0) {
            cerr << "error input." << endl;
            return -1;
        }
        if (x == 0 || x == 1) return x;
        int max, mid ,min =0;
        max = x / 2 + 1;

        while (true) {
            mid = (min + max) / 2;
            if (mid == x / mid) return mid;
            else if (mid < x / mid) {
                if ((mid + 1) > x / (mid + 1))return mid;
                min = mid;
            } else {
                if ((mid - 1) < x / (mid - 1))return mid - 1;
                max = mid;
            }
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


