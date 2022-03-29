 class Solution {
public:
    string XXX(string s, int numRows) {
        vector<string> rows;

        if(numRows==1){
            return s;
        }

        for(int i=0;i<numRows;i++){
            rows.push_back("");
        }

        // the size of repeat pattern
        // example: 4 rows
        // 1     7
        // 2   6 8
        // 3 5   9
        // 4     10
        // in this case, the repeat size would be 2*(4 -1)
        // since you can notice that 7 starts at row 1 again

        int repeatSize = 2*(numRows-1);

        for(int i=0;i<s.size();i++){
            // find the relative postion in one repeating pattern
            int repeatPosi = i%repeatSize;

            // find the distance from current position to center
            // position of the repeating pattern
            int dist = abs(numRows-1-repeatPosi);

            // put this element to its corresponding row position in vector
            int rowPosi = numRows - dist - 1;

            rows[rowPosi] += s[i];
        }

        string result = "";
        
        for(int i=0;i<rows.size();i++){
            result += rows[i];
        }

        return result;

    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

