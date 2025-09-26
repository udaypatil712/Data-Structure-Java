{
    let arr=[5,2,6,7,9];
    let ans=findIndex(arr);
    console.log(ans)

    function findIndex(arr){  //O(log n)
        let s=0;    
        let e=arr.length-1;

        while(s<e){
            let mid=Math.floor(s+(e-s)/2);
            if(arr[mid]>arr[mid+1]){
                e=mid;
            }else if(arr[mid]<=arr[mid+1]) {  //
                s=mid+1;
            }
        }
        return s;
    }
}