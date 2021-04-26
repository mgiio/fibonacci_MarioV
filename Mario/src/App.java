public class App {
    public static void main(String[] args) throws Exception {
        //Mario Vilanova
        int serie = 10;
        int num1 = 0;
        int num2 = 1;
        int suma = 1;
 
        // Mostra el valor inicial
        System.out.println(num1);
         
        for (int i = 1; i < serie; i++) {
             
            // mostro la suma
            System.out.println(suma);
             
            //primer sumem
            suma = num1 + num2;
            //Despues, cambiem la segona variable per la primera
            num1 = num2;
            //Per ultimo, cambiem la suma per la segona variable
            num2 = suma;
                        
        }
    }
}
