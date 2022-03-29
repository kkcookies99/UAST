 var XXX = function(s) {
    let str = s.replace(/[^a-zA-Z0-9]/g, '').toLowerCase()
    return str === str.split('').reverse().join('')
};

