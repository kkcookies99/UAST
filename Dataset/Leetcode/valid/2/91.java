/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        int num = listNodeToInt(l1) + listNodeToInt(l2);
        return intToListNode(num);
    }
    
    private int listNodeToInt(ListNode listNode) {
        //链表转换成int栈
        Deque<Integer> stack = new LinkedList<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        //int栈通过String转换成int数字
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        //注意Integer.parseInt()和Integer.valueOf()的区别
        return Integer.parseInt(builder.toString());
    }
    
    private ListNode intToListNode(int num) {
        //int数字通过String、char类型转换成int栈
        Deque<Integer> stack = new LinkedList<>();
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            //stack.push(Integer.valueOf(chars[i])); // ASCII码
            stack.push(Integer.valueOf(String.valueOf(chars[i])));
        }
        //通过栈去创建链表。
        return stackToListNode(stack);
    }
    
    private ListNode stackToListNode(Deque<Integer> stack) {
        if (stack.isEmpty()) {
            return null;
        }
        ListNode node = new ListNode(stack.pop());
        node.next = stackToListNode(stack);
        return node;
    }
}

