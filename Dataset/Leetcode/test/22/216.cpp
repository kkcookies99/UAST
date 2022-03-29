 class Solution {
  public:
    vector<string> XXX(int n) {
      std::vector<std::string> result;
      dfs("", n, n, result);
      return result;
    }

    void dfs(std::string input, int left, int right, std::vector<std::string>& result) {
      if (!left && !right)
        result.emplace_back(std::move(input));    // 将元素添加到容器中时，从结果字符串移动，而非复制
      if (left < right)
        dfs(input + ')', left, right - 1, result);
      if (left)
        dfs(input + '(', left - 1, right, result);
    }
};

