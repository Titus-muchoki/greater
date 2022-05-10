public class greater {
    public static void main(String[] args) {
        int result= sum(9,1);
        System.out.println(result);
    }
    public static  int sum(int start, int end) {
        if (start > end ) {
            return end + sum(end, start - 1);
        }else {
            return  start;

        }
    }
}
