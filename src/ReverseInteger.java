public class ReverseInteger {

    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
//        int x = -23;
        System.out.println(reverse2(x));
    }

    private static int reverse(int x) {
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x = Math.abs(x);
        }
        String res = "";
        while (x > 0) {
            res += (x % 10);
            x = x / 10;
        }
        if (res.equals("") || Long.parseLong(res) > Integer.MAX_VALUE) {
            return 0;
        } else {
            int parseInt = Integer.parseInt(res);
            return negative ? -parseInt : parseInt;
        }

    }

    public static int reverse3(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }


    private static int reverse2(int x) {
        long resInt = 0;
        while (Math.abs(x) > 0) {
            resInt = resInt * 10 + (x % 10);
            x = x / 10;
        }
        if (resInt > Integer.MAX_VALUE || resInt < Integer.MIN_VALUE) {
            return 0;
        } else {
            return Math.toIntExact(resInt);
        }
    }
}
