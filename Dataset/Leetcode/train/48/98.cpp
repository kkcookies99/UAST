class Solution {
public:
void XXX(vector<vector<int>> &matrix) {
    if (matrix.empty()) {
        return;
    }
    int n = matrix.size();
    int max_pos = (n+1)/2;
    for (int i = 0; i < max_pos; i++) {
      for (int j = i;j< n-i-1;j++){
        int x = i, y = j;
        int tmp1=matrix[x][y];
        for (int count = 0; count < 4; count++) {
          int next_x = y;
          int next_y = n - 1 - x;
          int tmp2 = matrix[next_x][next_y];
          matrix[next_x][next_y] = tmp1;
          x = next_x;
          y = next_y;
          tmp1 = tmp2;
        }
      }
    }
}

};

