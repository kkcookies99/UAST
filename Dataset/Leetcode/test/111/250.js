var XXX = function(root) {
    let arr = []
    if (!root) return 0
    preOrder(root, arr, 1)
    arr.sort((a, b) => a - b)
    return arr[0]
};

const preOrder =  function(root, arr, num) {
    if (!root) return
    if (!root.left && !root.right) {
        arr.push(num)
    } else {
        preOrder(root.left, arr, num + 1)
        preOrder(root.right, arr, num + 1)
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


