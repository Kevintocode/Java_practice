public class reverse_string {
    public static void main(char[] s) {
        int left = 0, right = s.length-1;
        while(left < right){
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp ;
        }
    }


    public int singleNumber(int[] nums) {
        List<Integer> my_list = new ArrayList<>();

        for(int i : nums){
            if(!my_list.contains(i)){
                my_list.add(i);
            }else{
                my_list.remove(new Integer(i));
            }
        }

        return my_list.get(0);
    }

}



