package Methods;

public class Methods {
    public void primeNumber(){
        int n=19;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("It is not a prime number");
                System.exit(0);
            }
        }
        System.out.println("It is a prime number");
    }

    // Greatest common divisor or Highest common number
    public void GCD(){
        int m=25, n=15;
        while(m!=n) {
            if(m>n){
                m = m-n;
            } else {
                n = n-m;
            }
        }
        System.out.println("The GCD of the number is : "+ m);
    }

    public int maxArray(int[] A) {
        int max=0;
        for(int i=0;i<A.length-1;i++){
            if (A[i] > max) {
                max=A[i];
            }
        }
        return max;
    }
    public int varArgs(int ...A) {
        int max=0;
        for(int i=1;i<A.length-1;i++){
            if (A[i] > max) {
                max=A[i];
            }
        }
        return A.length==0 ? Integer.MIN_VALUE : max;
    }
}
