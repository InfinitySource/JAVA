package SpaceProblems;

public class SpaceProblems {

    public static void SpaceProblem1(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void SpaceProblem2(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (j == i || i == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void SpaceProblem3(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == n || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void SpaceProblem4(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                if (i == 1 || j == n || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                // System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void SpaceProblem5(int n) {

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (j == n || j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                // System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void SpaceProblem6(int n) {

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i == n || i == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                // System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void SpaceProblem7(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                // System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void SpaceProblem8(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                // System.out.print("*");
            }
            for (int j = n - 1; j >= 1; j--) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void SpaceProblem9(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                // System.out.print("*");
            }
            for (int j = n - 1; j >= 1; j--) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void SpaceProblem10(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 2 == 0) {
                    if(i ==j)
                    for (int k = 1; k <= n; k++) {
                        for (int l = 1; l <= n; l++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                } else {
                    for (int k = 1; k <= n; k++) {
                        for (int l = 1; l <= n; l++) {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                }
            }
            System.out.println();
        }

    }

}
