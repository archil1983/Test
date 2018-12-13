public class Main {


    private static int calculateNumber(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        final int length = input.length();
        int result = length;

        char[] data = input.toCharArray();
        for (int i = 0; i < length - 1; i++) {
            if (data[i] == data[i + 1]) {
                result++;
                int currentIndex = i+1;
                while (true) {
                    int delta = 1;
                    if (currentIndex + delta >= length) {
                        break;
                    }
                    if (data[currentIndex] == data[currentIndex + delta]) {
                        result++;
                    } else {
                        break;
                    }
                    delta++;
                }
            }
            if (i >= length - 2) {
                continue;
            }
            if (data[i] != data[i + 1] && data[i] == data[i + 2]) {
                result++;
                int indexofmiddle = i + 1;
                while (true) {
                    int delta = 2;
                    if (indexofmiddle - delta <= 0 || indexofmiddle + delta >= length) {
                        break;
                    }
                    if (data[indexofmiddle - delta] == data[indexofmiddle + delta]) {
                        result++;

                    } else {
                        break;
                    }
                    delta++;
                }
            }

        }
        return result;

    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
