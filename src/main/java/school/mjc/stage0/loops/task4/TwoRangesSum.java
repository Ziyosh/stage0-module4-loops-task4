package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum = 0;

        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow<0) {
            System.out.println("last number in row is negative");
        } else if(numberToSkip == lastInRow){

            for (int i = 1; i <= lastInRow; i++) {
                sum += i;
            }
            System.out.println("skipped sum is number " + sum);
            System.out.println("counted sum is number " + (numberToSkip - lastInRow) );
        }





//        for(int i=1; i<=numberToSkip && i<lastInRow; i++) {
//            if (numberToSkip > lastInRow) {
//                System.out.println("number to skip is bugger then the last");
//            } else if (lastInRow<0) {
//                System.out.println("last number in row is negative");
//            }else{
//                System.out.println("skipped sum is number " + (numberToSkip + lastInRow));
//                System.out.println("counted sum is number " + i);
//            }
//        }
    }
}
