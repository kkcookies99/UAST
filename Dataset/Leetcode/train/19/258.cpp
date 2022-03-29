 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
	ListNode* temp1 = new ListNode(0);
	temp1->next = head;
	ListNode* temp2 = temp1;
	int flag = 1;
	while (n--) {
		temp1 = temp1->next;
		if (temp1->next == nullptr)	//遍历结束，说明删除第一个元素
			flag = 0;
	}

	if (flag == 0) {
		head = head->next;
		return head;
	}

	else {
		while (temp1->next)
		{
			temp1 = temp1->next;
			temp2 = temp2->next;
		}
		//判断是否是最后一个节点
		if (temp2->next->next) {
			temp2->next = temp2->next->next;
			//return head;
		}
		else {
			temp2->next = nullptr;
		}
	}
	return head;
    }
};

