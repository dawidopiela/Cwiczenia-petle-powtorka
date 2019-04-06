package ex1;

import java.util.Random;

public class Ex1 {

    //#####
    //#   #
    //#   #
    //#   #
    //#####

    public String buildQuarter(char sign, int size) {

        String pattern = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == (size - 1)) {
                    pattern += sign;
                } else if (j == 0 || j == (size - 1)) {
                    pattern += sign;
                } else {
                    pattern += "";

                }
            }
        }


        return pattern;
    }


//#####
//##  #
//# # #
//#  ##
//#####


    public String buildQuarterWithOneDiagonal(char sign, int size) {

        String pattern = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == (size - 1)) {
                    pattern += sign;
                } else if (j == 0 || j == (size - 1) || i == j) {
                    pattern += sign;
                } else {
                    pattern += " ";

                }

            }
            pattern += "\n";
        }
        return pattern;
    }


    public String buildQuarterWithDiagonals(char sign, int size) {

        String pattern = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == (size - 1)) {
                    pattern += sign;
                } else if (j == 0 || j == (size - 1) || i == j || i == ((size - 1) - j)) {
                    pattern += sign;
                } else {
                    pattern += " ";

                }

            }
            pattern += "\n";
        }
        return pattern;
    }


    // # # # #
    public String square(char sign, int size) {

        String pattern = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == (size - 1)) {

                    pattern += sign;

                } else if (i == 0 || i == (size - 1)) {
                    pattern += sign + "_";
                } else if (j == 0 || j == (size - 1) || i == j || i == ((size - 1) - j)) {

                    pattern += sign + "_";
                } else {
                    pattern += "__";

                }

            }
            pattern += "\n";
        }
        return pattern;
    }


//5 | #####
//2  | ##
//1  | #
//3 | ###
//5 | #####

    public String randomChart(char sign, int size) {
        String pattern = "";
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int los = random.nextInt(11);
            pattern += los + " | ";
            for (int j = 0; j < los; j++) {
                pattern += sign;
            }
            pattern += "\n";
        }

        return pattern;
    }

    // #
    // # #
    // # # #   #
    // # # # # #  i
    // - - - - -
    // 4 3 2 1 3
          //j

    public String randomBarChar(char sign, int size) {
        String pattern = "";
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i<array.length; i++) {
            array[i] = random.nextInt(10);
        }

        for( int j= 11; j>0 ; j--){
            for (int i=0; i<size; i++){
                if(array[i]>= j) {
                    pattern += sign;
                }else {
                    pattern += " ";

                    }
                }
                pattern += "\n";

            }
            for (int i= 0; i<size; i++){
                pattern+= "-";
        }
        pattern+= "\n";
            for (int i = 0; i<size; i++){
                pattern += array[i];
            }
return  pattern;
    }
}
