package task;

    import java.util.Scanner;

    public class CalculateMathApp {
        public static void main(String[] args) {
            int[] dig3 = new int[2];
            int[] dig4 = new int[2];
            int[] dig5 = new int[2];
            int dig6 = 0;

            getNumbers(dig3, dig4, dig5, dig6);
//        for (int i = 0; i < dig3.length; i++) {
//            System.out.println(dig3[i]);
//        }
        }

        public static void getNumbers(int[] dig3, int[] dig4, int[] dig5, int dig6) {
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 7; i++) {
                int num = sc.nextInt();
                switch (String.valueOf(num).length()) {
                    case 3:
                        assignNumber(dig3, num);
                        break;
                    case 4:
                        assignNumber(dig4, num);
                        break;
                    case 5:
                        assignNumber(dig5, num);
                        break;
                    default:
                        dig6 = num;
                        break;
                }
            }
        }

        public static void assignNumber(int[] array, int num) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    array[i] = num;
                    break;
                }
            }
        }
    }