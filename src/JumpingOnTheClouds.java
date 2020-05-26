public class JumpingOnTheClouds {

    public static void main(String[] args) {
        int[] c = {0, 0, 1, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(c));
    }

    static int jumpingOnClouds(int[] c) {
        int res =0;
        for(int i=0;i<c.length-1; i++){
            if(i+2<c.length && c[i+2]==0){
                i++;;
            }
            res++;
        }
        return res;
    }
}
