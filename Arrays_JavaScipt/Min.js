{
    let arr=[4,5,3,8,6,2];
    let min=arr[0];

    for(let i=1;i<arr.length;i++){ // time complexcity is O(n)
        if(arr[i]<min){
            min=arr[i];
        }
    }
    console.log(min)

    // const arr1=[5,6,8];
    // let min=Math.min(...arr1);
    // console.log("max element.."+min)
}