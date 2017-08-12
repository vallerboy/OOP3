/**
 * Created by Lenovo on 10.08.2017.
 */
public class Methods {

    //dodawanie
    public int add(int a, int b){
        return a + b;
    }

    //odejmowanie
    public int substract(int a, int b){
        return a - b;
    }

    //mnozenie
    public int multipy(int a, int b){
        return a * b;
    }

    //dzielenie
    public int divide(int a, int b){
        if(b == 0) {
            System.out.println("Nie dziel przez 0");
            return 0;
        }
        return a / b;
    }

    //dzielenie z obsluga wyjatku*
    public int divideT(int a, int b){
        if(b == 0) {
          throw new IllegalArgumentException("Nie dziel prezz 0");
        }
        return a / b;
    }

        // suma cyfr zadanej liczby
        public int rest(int a){
           String myNumber = String.valueOf(a);
           int sum = 0;
           for(int i = 0; i < myNumber.length(); i++){
               sum += Character.getNumericValue(myNumber.charAt(i));
           }
           return sum;
        }

        //suma cyfr zadanej liczby v2
        public int restP(int a){
            int sum=0;
            while(a>=10){
                sum+=a%10;
                a/=10;

            }
            sum+=a;
            return sum;

    }

    //sprawdzanie czy liczba jest kwadratem innej liczby
    public boolean isSquare(int a) {

            for(int i = 1; i  <= a/2; i++){
                if(i * i == a) {
                    return true;
                }
            }
            return  false;

    }

    //sprawdzanie czy liczba jest kwadratem innej liczby v2
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

    // Czy liczby są pitagorejskie? Skrócony zapis ifa
    public boolean isPitagoras(int a, int b, int c){
        return a * a + b * b == c * c;
    }

    // liczba dzielników liczby
    public int dividers(int a){
        int count = 0;
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                count++;
            }
        }
        return count;
    }

    //Największy wspólny dzielnik
    public int nwd(int a, int b){
        while (a != b){
            if(a > b){
                a -= b;
            }
            if(b > a){
                b -= a;
            }
        }
        return a;
    }



}
