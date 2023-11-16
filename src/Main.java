//Scrivere una funzione che controlli se un numero int è in un determinato range
//Se lo è ritorna true se non lo è lancia un'eccezione.

//ESEGUITO DA MARGHERITA DEODATO
public class Main {

    private static boolean ExeptionRange(int numeroCheck, int rangeMin, int rangeMax) {
        return numeroCheck >= rangeMin && numeroCheck <= rangeMax;}

        public static void main(String[] args) {

            int numeroCheck = 100;
            int rangeMin = 10;
            int rangeMax = 200;


        if (ExeptionRange(numeroCheck, rangeMin, rangeMax)) {
            System.out.println(numeroCheck + " è nel range compreso tra " + rangeMin + " e " + rangeMax);
        } else {
            System.out.println(numeroCheck + " non è nel range compreso tra " + rangeMin + " e " + rangeMax);
        }
    }
}

// ESEGUITO DA SIMONE LIOTTA

/*public class EsercizioExceptions1 {
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
}*/
