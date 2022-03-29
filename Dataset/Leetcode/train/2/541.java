 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        // 此处的0可以为任意值，最后取值是.next
        ListNode result = new ListNode(0);
        ListNode i = l1, j = l2, temp = result;
        // 进位
        int count = 0;        
        while(i != null || j !=null){
            // 如果为空就用0来补位
            int x = i != null ? i.val : 0;
            int y = j != null ? j.val : 0;
            int sum = x + y + count;
            // 总和比10大说明要进位
            if(sum / 10 > 0){
                count = 1;
            } else{
                count = 0;
            }
            // 给下一个ListNode赋值
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            
            if(i != null){
                i = i.next;
            }
            if(j != null){
                j = j.next;
            }
        }
        // 当最后一位数相加需要空补进位的情况
        if(count > 0){
            temp.next = new ListNode(count);
        }
        
        return result.next;
    }
}

