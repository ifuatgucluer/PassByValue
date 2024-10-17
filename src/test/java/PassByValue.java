
    public class PassByValue {

        public static void main(String[] args) {
            // Main method'dan diger method'lara veya diger method'lardan main method'a
            // bir variable gonderirseniz Java orjinal variable'lari degil
            // onlarin degerlerini(value) goturur, orjinal variable'in degeri degismez

            int fiyat=200;


            System.out.println(indirimYap25(fiyat)); //  75
            System.out.println("method'dan sonra main method'daki fiyat : " + fiyat); // 100

            // indirimi kalici yapmak istiyoprsaniz main method'da atama yapmaniz gerekir
            fiyat = indirimYap10(fiyat);



            System.out.println("method'dan sonra main method'daki fiyat : " + fiyat); // 100
        }

        private static int indirimYap25(int fiyat) {
            fiyat*=0.50;

            return fiyat;
        }

        private static int indirimYap10(int fiyat) {

            fiyat*=0.80;
            return fiyat;

        }

    }