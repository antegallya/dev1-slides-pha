public class Ex69 {
    public static void while3(){
        boolean isDone = false;
        int count = 0;
        int x = 10;
        while (!isDone && count < 3){
            if (x % 2 == 0){
                x = x + 1;
                isDone = x > 20;
            } else {
                x = x + 3;
                count = count + 1;
            }
        }
        System.out.println(x);
    }
}
