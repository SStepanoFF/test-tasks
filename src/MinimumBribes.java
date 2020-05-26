public class MinimumBribes {

   //NOT DONE
    public static void main(String[] args) {
        int[] q = {2, 1, 5, 3, 4};
        minimumBribes(q);
    }

    static void minimumBribes(int[] a) {
        int bribes =0;
        for(int i=a.length-1; i>0;i--) {
            if(a[i]!=i) {
                if(a[i]==a[i--]) {
                    bribes++;
                } else if(a[i]==a[i-2]) {
                    bribes+=2;
                } else {
                    System.out.println("Too chaotic");
                }
            }
        }
        System.out.println(bribes);
    }
}
