/** java版本 */
class Solution {
    public ListNode XXX(ListNode list1, ListNode list2) {
        
        ListNode result = new ListNode();
        ListNode temp = result;

        while (list1 != null || list2 != null) {
            // 获取数据，结点为空时设为0
            int n1 = list1 != null ? list1.val : 0;
            int n2 = list2 != null ? list2.val : 0;
            // list1和list2移动到下一位
            list1 = list1 != null ? list1.next : null;
            list2 = list2 != null ? list2.next : null;
            
            int sum = temp.val + n1 + n2;
            if (sum >= 10) {
                // 取需进位的值和个位的值
                int carry = sum / 10;
                sum %= 10;
                // 将进位数设置到下个结点
                temp.next = new ListNode(carry);
            } else if (list1 != null || list2 != null) {
                // 如果两个链表还有数据则在新链表后继续添加结点
                temp.next = new ListNode();
            }
            // 当前结点设置新值
            temp.val = sum;
            temp = temp.next;
        }
        return result;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

