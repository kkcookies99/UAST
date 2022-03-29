 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* totail = head;
		ListNode** pp_pre = &head;

		while (n--) totail = totail->next;
		while (totail) {
			totail = totail->next;
			pp_pre = &((*pp_pre)->next);
		}

		*pp_pre = (*pp_pre)->next;
		return head;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


