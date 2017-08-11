/**
 * Created by Lenovo on 10.08.2017.
 */
public class Methods {

    public int add(int a, int b){
        return a + b;
    }

    public int substract(int a, int b){
        return a - b;
    }

    public int multipy(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        if(b == 0) {
            System.out.println("Nie dziel przez 0");
            return 0;
        }
        return a / b;
    }

    public int divideT(int a, int b){
        if(b == 0) {
          throw new IllegalArgumentException("Nie dziel prezz 0");
        }
        return a / b;
    }

        public int rest(int a){
           String myNumber = String.valueOf(a);
           int sum = 0;
           for(int i = 0; i < myNumber.length(); i++){
               sum += Character.getNumericValue(myNumber.charAt(i));
           }
           return sum;
        }

        public int restP(int a){
            int sum=0;
            while(a>=10){
                sum+=a%10;
                a/=10;

            }
            sum+=a;
            return sum;

    }

    public boolean isSquare(int a) {

            for(int i = 1; i  <= a/2; i++){
                if(i * i == a) {
                    return true;
                }
            }
            return  false;

    }

    public boolean isSquare2 (int a){
            double div = 1;
            double sum = 0;

            while (div <= a){
                sum = a/div;
                if (div == sum){
                    return true;
                }
                div++;
            }
            return false;
    }




}
