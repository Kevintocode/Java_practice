public class SecondLarge {
    public static int second(int arr[]){
        int first, second;
        first = Integer.MIN_VALUE;
        second = Integer.MIN_VALUE;

        for(int i=0; i < arr.length; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }else if(arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args){
        int arr[] = {55,88,77,88,66,33,44};
        int result = second(arr);
        System.out.println("Second large " + result);

    }
}
