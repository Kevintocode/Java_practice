public class reverse_string {
    public static void main(char[] s) {
        int left = 0, right = s.length-1;
        while(left < right){
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp ;
        }
    }
}




