class FactorialClassObject {
    int i, fact = 1;
    int number = 5;

    void getData() {
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("factorial of " + number + " is:- " + fact);
    }

    public static void main(String[] args) {
        FactorialClassObject a = new FactorialClassObject();
        a.getData();
    }
}