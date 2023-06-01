
class FactorialClassObject {
    int i, fact = 1;

    public int getData(int n) {
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {

        FactorialClassObject a = new FactorialClassObject();
        int number = 5;
        int result = a.getData(number);
        System.out.println("factorial of " + number + " is:- " + result);
    }
}
