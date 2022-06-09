import java.util.Arrays;

public class Exercitii {

        public boolean Ex1(int[] lista){
                int counter = 1;
                for (int i=1; i< lista.length; i++) {
//                    System.out.println(i);
                        if( (lista[i] % 2 == 0 && lista[i-1] % 2 ==0 || lista[i] % 2 == 1 && lista[i-1] % 2 == 1)){
                             counter++;
                             if ( counter == 3 ){
                                     return true;
                             }else if (counter > 3) {
                                     counter = 0;
                             }
                        }
                }
            return false;
        }

        public int Ex2(int[] lista) {
            if(lista.length == 0) return 0;
            if(lista.length == 1) return lista[0];
            else {
                return Arrays.stream(lista).max().getAsInt() - Arrays.stream(lista).min().getAsInt();
            }
        }

}
