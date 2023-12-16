public class Module01 {
        public static void main(String[] args) {
            System.out.println(checkString("Questa è una stringa"));
            System.out.println(checkStringOT("Questa è una stringa"));
        }

        private static String checkString(String value) {
            String result;
            if (value.length() >= 10) {
                result = "Lunghezza maggiore o uguale di 10";
            } else {
                result = "Lunghezza minore di 10";
            }
            return result;
        }

        private static String checkStringOT(String value){
            final String result = value.length() >= 10
                    ? "Lunghezza maggiore o uguale di 10"
                    : "Lunghezza minore di 10";
            return result;
        }

}
