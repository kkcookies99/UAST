 class Solution {
public:
  // 打表 （对付面试，笔试的时候不建议使用）
  string XXX(int num) { // 1 <= num <= 3999
    // 个位
    unordered_map<int, string> unit{{0, ""}, {1, "I"}, {2, "II"}, {3, "III"}, {4, "IV"}, {5, "V"}, {6, "VI"}, {7, "VII"}, {8, "VIII"}, {9, "IX"}};
    // 十位
    unordered_map<int, string> ten{{0, ""}, {1, "X"}, {2, "XX"}, {3, "XXX"}, {4, "XL"}, {5, "L"}, {6, "LX"}, {7, "LXX"}, {8, "LXXX"}, {9, "XC"}};
    // 百位
    unordered_map<int, string> hundred{{0, ""}, {1, "C"}, {2, "CC"}, {3, "CCC"}, {4, "CD"}, {5, "D"}, {6, "DC"}, {7, "DCC"}, {8, "DCCC"}, {9, "CM"}};
    // 千位
    unordered_map<int, string> thousand{{0, ""}, {1, "M"}, {2, "MM"}, {3, "MMM"}};

    return thousand[num / 1000] + hundred[(num / 100) % 10] + ten[(num / 10) % 10] + unit[num % 10];
  }

  // Greedy
  string XXXII(int num) {
    vector<int> nums{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    unordered_map<int, string> m{{1, "I"}, {4, "IV"}, {5, "V"}, {9, "IX"}, {10, "X"}, {40, "XL"},
                                 {50, "L"}, {90, "XC"}, {100, "C"}, {400, "CD"}, {500, "D"}, {900, "CM"}, {1000, "M"}};

    string ans;
    for (int i = nums.size() - 1; i >= 0; --i) {
      while (num >= nums[i]) {
        num -= nums[i];
        ans += m[nums[i]];
      }
    }

    return ans;
  }
};

