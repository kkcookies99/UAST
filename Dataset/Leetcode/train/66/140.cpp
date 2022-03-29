 class Solution {
public:
  vector<int> XXX(vector<int>& digits) {
    int carry = 0;
    int size = digits.size();
    int curr = size - 1;

    while(curr >= 0) {
      int num = curr == size - 1
                      ? digits[curr] + carry + 1
                      : digits[curr] + carry;

      digits[curr] = num >= 10 ? num % 10 : num;

      if(num < 10) return digits;

      curr--;
      carry = num >= 10 ? 1 : 0;
    }

    vector<int> result(size + 1);
    result[0] = 1;
    return result;
  }
};

