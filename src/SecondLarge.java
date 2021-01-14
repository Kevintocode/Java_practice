public class SecondLarge {
    public static int second(int arr[]){
        int first_large, second_large;
        first_large = Integer.MIN_VALUE;
        second_large = Integer.MIN_VALUE;


        for(int i = 0; i < arr.length; i ++){
            if (arr[i] > first_large){
                second_large = first_large;
                first_large = arr[i];
            }else if(arr[i] > second_large && arr[i] != first_large){
                second_large = arr[i];
            }
        }

        return second_large;
    }

    public static void main(String[] args){
        int arr[] = {55,88,77,88,66,33,44};
        int result = second(arr);
        System.out.println("Second large " + result);

    }
}
