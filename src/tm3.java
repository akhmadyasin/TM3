public class tm3 {
    public static class Calculating {
        private int number1;
        private int number2;

        public int getNumber1() {
            return number1;
        }

        public void setNumber1(int number1) {
            this.number1 = number1;
        }

        public int getNumber2() {
            return number2;
        }

        public void setNumber2(int number2) {
            this.number2 = number2;
        }

        public void AddAllNumber() {
            int i = number1 + number2;
            System.out.println("AddAllNumber : " + i);
        }

        public void MultiplyNumber(int a, int b) {
            int j = a * b;
            System.out.println("MultiplyNumber : " + j);
        }
    }
    public static void main(String[] args) {
        Calculating z = new Calculating();
        z.setNumber1(6);
        z.setNumber2(90);
        z.AddAllNumber();
        z.MultiplyNumber(z.getNumber1(), z.getNumber2());
    }
}
