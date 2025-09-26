{
    let arr = [2,3,5,6,7]
    let target = 5;
    let ans=search(arr,target);
    console.log(ans);

    function search(arr,target){

        let s=0;
        let e=arr.length-1;

        while(s<=e){
            let mid=(s + (e-s)/2);

            if(target===arr[mid]){
                return mid;

            }else if(arr[mid] < target){
                s=mid+1;

            }else{
                e=mid-1;
                
            }
        }
        return -1;
    }

}