function ConvertToArray(nodes) {
  let arr = []
  let now = nodes
  while (now) {
    arr.push(now.val)
    now = now.next
  }
  return arr
}

function ConvertToListNodes(arr) {
  let nodes = {
    val: arr[arr.length - 1],
    next: null
  }
  for (let i = arr.length - 2; i >= 0; i--) {
    nodes = {
      val: arr[i],
      next: nodes
    }
  }
  return nodes
}

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
 var XXX = function(l1, l2) {
  let arr1 = ConvertToArray(l1)
  let arr2 = ConvertToArray(l2)
  let len = Math.max(arr1.length, arr2.length)
  let jw = {0: 0}

  let result = []
  for(let i = 0; i < len; i++) {
    let he = (arr1[i] || 0) + (arr2[i] || 0) + jw[i]
    let zhi = he % 10
    result[i] = zhi
    jw[i + 1] = Math.floor(he / 10)
  }
  if(jw[len]) {
    result.push(1)
  }
  return ConvertToListNodes(result)
};


