//Scrivere una funzione che controlli se un numero int è in un determinato range
//Se lo è ritorna true se non lo è lancia un'eccezione.

public class Main {
    public static void main(String[] args) {

        try {
            int value = 4;
            boolean control = isInRange(value);
            System.out.println(control);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
    public static boolean isInRange(int value){
        if (0<value&&value<11){
            return true;
        } else {
            throw new RuntimeException("Il numero non è nel range");
        }
    }
}
