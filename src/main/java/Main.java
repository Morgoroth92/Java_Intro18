public class Main {
    public static void main(String[] args) {

        isThisCharAnOperator('+');
    }

    public static void isThisCharAnOperator(char c) {
        switch (c) {
            case '+':
                System.out.println("Questa è una addizione");
                break;
            case '-':
                System.out.println("Questa è una sottrazione");
                break;
            case '*':
                System.out.println("Questa è una moltiplicazione");
                break;
            case '/':
                System.out.println("Questa è una divisione");
                break;
            default:
                System.out.println("Questa non è un operatore");
                break;
        }
    }
}
