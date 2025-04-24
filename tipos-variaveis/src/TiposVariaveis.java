public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
         // Tipos Inteiros
         byte exemploByte = 127;             // Ocupa 1 byte (-128 a 127)
         short exemploShort = 32000;         // Ocupa 2 bytes (-32.768 a 32.767)
         int exemploInt = 100000;            // Ocupa 4 bytes (-2^31 a 2^31-1)
         long exemploLong = 10000000000L;    // Ocupa 8 bytes (-2^63 a 2^63-1), note o 'L' no final
 
         // Tipos Reais
         float exemploFloat = 3.14f;         // Ocupa 4 bytes (até 7 casas decimais), precisa do 'f' no final
         double exemploDouble = 3.1415926535; // Ocupa 8 bytes (até 15 casas decimais)
 
         // Tipo Caractere
         char exemploChar = 'A';             // Ocupa 2 bytes (um caractere Unicode)
 
         // Tipo Booleano
         boolean exemploBoolean = true;      // Ocupa 1 bit (true ou false)
    
         // Impressão dos valores
         System.out.println("byte: " + exemploByte);
         System.out.println("short: " + exemploShort);
         System.out.println("int: " + exemploInt);
         System.out.println("long: " + exemploLong);
         System.out.println("float: " + exemploFloat);
         System.out.println("double: " + exemploDouble);
         System.out.println("char: " + exemploChar);
         System.out.println("boolean: " + exemploBoolean);
        


    }
}
