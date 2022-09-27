public class Main {
    public static void main(String[] args) {

        String frase = "Las tortugas ninja son: ";
        String[] nombres = {"Michelangelo", "Donatello", "Leonardo", "Raphael"};

        for(String nombre: nombres){
            if(nombre != nombres[nombres.length - 1] ){
                frase += nombre + ", ";
            }else{
                frase += nombre + ".";
            }

        }

        System.out.println(frase);
    }
}