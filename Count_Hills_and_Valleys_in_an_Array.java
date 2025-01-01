public int countHillsAndValleys(int[] array) {
    int countHills = 0;
    int countValleys = 0;
    
    for (int i = 0; i < array.length; i++) {
       
        if (array[i] > array[i + 1]) {
            countHills++;
        } 
     
        else if (array[i] < array[i + 1]) {
            countValleys++;
        }
    }
    return countHills + countValleys;
}
