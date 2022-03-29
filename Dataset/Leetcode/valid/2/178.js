/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var XXX = function (l1, l2) {
  // 新建处理后的空链表
  const l3 = new ListNode(0)
  // 定义三个指针
  let p1 = l1
  let p2 = l2
  let p3 = l3
  // 每次相加后保留到下次相加的个位数值
  let temp = 0
  // 遍历双链表
  while (p1 || p2) {
    // 需要相加的值
    const v1 = p1 ? p1.val : 0
    const v2 = p2 ? p2.val : 0
    // 相加的结果
    const val = v1 + v2 + temp
    // 更新保留的位数值
    temp = Math.floor(val / 10)
    // 将相加的结果的十位数值存入新链表
    p3.next = new ListNode(val % 10)

    // 移动 p1 p2 p3 指针
    if (p1) p1 = p1.next
    if (p2) p2 = p2.next
    p3 = p3.next
  }
  // 如果最后还有个位数值，需要再一次存入 l3 链表
  if (temp) {
    p3.next = new ListNode(temp)
  }

  // 返回 l3.next 就是后续新加的链表值
  return l3.next
}


