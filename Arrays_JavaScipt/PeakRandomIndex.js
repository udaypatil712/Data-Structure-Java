{
    let arr = [7, 10, 4, 9,11];
    let ans = find(arr);
    console.log(ans); // Expected output: 1

    function find(arr) {    //O(n)
        let max = Math.max(...arr); // 10
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] === max) {
                return i; // return index of first max
            }
        }
    }
}
