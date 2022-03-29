 var XXX = function(root) {
  if (!root) {
    return []
  }
  const extractNodes = nodes => {
    if (nodes.length === 0) {
      return []
    }
    let ret = extractNodes(nodes.reduce((r, n) => {
      if (n.left) r.push(n.left)
      if (n.right) r.push(n.right)
      return r
    }, []))
    ret.unshift(nodes.map(n => n.val))

    return ret
  }
  return root ? extractNodes([root]) : []
};

