public class MathodOverloading {
    public static void main( String[] args){
        System.out.println(Dodaty(1,3));
        System.out.println(Dodaty(1,3,4));
    }
    public static int Dodaty(int a, int b){   return a + b;    }
    public static int Dodaty(int a, int b, int c) {    return a+b+c;     }
    public static String Dodaty (String a, String b) {
        return a + b;
    }
    public static int Dodaty (int[] iArray) {
        int sum = 0; for (int i: iArray) { sum +=i;
            return sum;
    }


    //1111111111111111111111111111222222
}
