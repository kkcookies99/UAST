class Solution {
public:
    int XXX(int n) {
      if(n==1) return 1;
      if(n == 2) return 2;
      int first = 1, second = 2;
      for(int i = 3;i<n+1;i++){
        int temp = second;
        second = second + first;
        first = temp;
      }
      return second;
    }
};

