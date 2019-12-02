package day2;

public class Three {
    public static void main(String[] args) {
        Three three = new Three();

        int[] intCode = {1, 12, 2, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 9, 1, 19, 1, 19, 5, 23, 1, 23, 6, 27, 2, 9, 27, 31, 1, 5, 31, 35, 1, 35, 10, 39, 1, 39, 10, 43, 2, 43, 9, 47, 1, 6, 47, 51, 2, 51, 6, 55, 1, 5, 55, 59, 2, 59, 10, 63, 1, 9, 63, 67, 1, 9, 67, 71, 2, 71, 6, 75, 1, 5, 75, 79, 1, 5, 79, 83, 1, 9, 83, 87, 2, 87, 10, 91, 2, 10, 91, 95, 1, 95, 9, 99, 2, 99, 9, 103, 2, 10, 103, 107, 2, 9, 107, 111, 1, 111, 5, 115, 1, 115, 2, 119, 1, 119, 6, 0, 99, 2, 0, 14, 0};
        int[] intCode2 = {1, 0, 0, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 9, 1, 19, 1, 19, 5, 23, 1, 23, 6, 27, 2, 9, 27, 31, 1, 5, 31, 35, 1, 35, 10, 39, 1, 39, 10, 43, 2, 43, 9, 47, 1, 6, 47, 51, 2, 51, 6, 55, 1, 5, 55, 59, 2, 59, 10, 63, 1, 9, 63, 67, 1, 9, 67, 71, 2, 71, 6, 75, 1, 5, 75, 79, 1, 5, 79, 83, 1, 9, 83, 87, 2, 87, 10, 91, 2, 10, 91, 95, 1, 95, 9, 99, 2, 99, 9, 103, 2, 10, 103, 107, 2, 9, 107, 111, 1, 111, 5, 115, 1, 115, 2, 119, 1, 119, 6, 0, 99, 2, 0, 14, 0};

        int[] result = three.processIntcode(intCode);
        System.out.println(result[0]);

        int resultNumber2 = three.processIntcodeTillSolution(intCode2);
        System.out.println(resultNumber2);
    }

    private int processIntcodeTillSolution(int[] intCode) {
        for (int index1 = 0; index1 < 100; index1++) {
            for (int index2 = 0; index2 < 100; index2++) {
                int[] cleanIntCode = intCode.clone();
                cleanIntCode[1] = index1;
                cleanIntCode[2] = index2;
                int[] sollution = new int[5];
                try {
                    sollution = processIntcode(cleanIntCode);
                    if (sollution[0] == 19690720){
                        return index1*100+index2;
                    }
                } catch (Exception e) {

                }

            }
        }
        return -1;
    }

    public int[] processIntcode(int[] intCode) {
        for (int index = 0; index < intCode.length / 4; index++) {
            int tempIndex = index * 4;
            int firstNumber = intCode[intCode[tempIndex + 1]];
            int secondNumber = intCode[intCode[tempIndex + 2]];

            switch (intCode[tempIndex]) {
                case 1:
                    intCode[intCode[tempIndex + 3]] = firstNumber + secondNumber;
                    break;
                case 2:
                    intCode[intCode[tempIndex + 3]] = firstNumber * secondNumber;
                    break;
                case 99:
                    return intCode;
                default:
                    throw new IllegalArgumentException();
            }
        }
        return intCode;
    }
}
