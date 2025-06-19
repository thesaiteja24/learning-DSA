class Main {
    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            // Left Space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            // Print Star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            // Print Space
            // for (int j = 0; j < n - i - 1; j++) {
            //     System.out.print("  ");
            // }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2 * n) - (2 * i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2 * n) - (2 * i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }

    static void pattern11(int n) {
        int value = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                value = 1;
            else
                value = 0;

            for (int j = 0; j < i + 1; j++) {
                System.out.print(value + " ");
                value = 1 - value;
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            for (int j = 0; j < (2 * n) - (2 * i + 2); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i - j);
            }
            System.out.println();

        }
    }

    static void pattern13(int n) {
        int c = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + n - i - 1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern16(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
    
    static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i -1; j++) {
                System.out.print("  ");
            }
            char ch = 'A';
            int breakPoint = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch + " ");
                if (j < breakPoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println();
        }
    }

    static void pattern18(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ch + (n - i + j - 1)) + " ");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        pattern18(5);
    }
}

