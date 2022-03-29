 class Solution {
public:
	struct Node {
		const int left;
		const int right;
		const std::string str;
	};
	std::vector<std::string> XXX(int n) {
		arr.clear();
		if (n <= 0) {
			return arr;
		}

		std::vector<Node> stack;
		stack.emplace_back(Node({n-1, n, "("}));
		
		while (true != stack.empty()) {
			auto node = stack.back();
			stack.pop_back();
			if (0 == node.left && 0 == node.right) {
				arr.emplace_back(node.str);
				continue;
			}

			if (node.left > 0) {
				stack.emplace_back(Node({ node.left - 1, node.right, node.str + "(" }));
			}
			if (node.right > 0 && node.left < node.right) {
				stack.emplace_back(Node({ node.left, node.right - 1, node.str + ")" }));
			}
		}
		return arr;
    }
private:
	std::vector<std::string> arr;
};

