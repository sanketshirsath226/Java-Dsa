package Class;

class FindMin {
    public static void main(String[] args) {
        System.out.println(min(new int[]{1,2,3,4,0}));
    }
    //return minimum value in array
    static int min(int[] arr){
        if(arr.length == 0 ) return -1;
        int min = arr[0];
        for(int element : arr)
            if(element < min)
                min = element;
        return min;
    }
}
