var XXX = function(root) {
  const result = [], queue = []
  if (!root) return []
  queue.push(root)

  while (queue.length) {
    let level = []
    const len = queue.length

    for (let i = 0; i < len; i++) {
      const top = queue.shift()
      level.push(top.val)

      if (top.left) queue.push(top.left)
      if (top.right) queue.push(top.right)
    }

    result.push(level)
  }

  return result
};

