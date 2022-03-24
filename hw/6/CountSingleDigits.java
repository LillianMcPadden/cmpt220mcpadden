public class CountSingleDigits{
    public static void main(String[] args){
        double [] array = new double[100];
        int count0 = 0; 
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        for (int i = 0; i < 100; i++){
            array[i] = Math.random() * 10;
            if((int)array[i] == 0){
                count0++;
            }
            else if((int)array[i] == 1){
                count1++;
            }
            else if((int)array[i] == 2){
                count2++;
            }
            else if((int)array[i] == 3){
                count3++;
            }
            else if((int)array[i] == 4){
                count4++;
            }
            else if((int)array[i] == 5){
                count5++;
            }
            else if((int)array[i] == 6){
                count6++;
            }
            else if((int)array[i] == 7){
                count7++;
            }
            else if((int)array[i] == 8){
                count8++;
            }
            else{
                count9++;
            }
        }
        System.out.println("0: " + count0);
        System.out.println("1: " + count1);
        System.out.println("2: " + count2);
        System.out.println("3: " + count3);
        System.out.println("4: " + count4);
        System.out.println("5: " + count5);
        System.out.println("6: " + count6);
        System.out.println("7: " + count7);
        System.out.println("8: " + count8);
        System.out.println("9: " + count9);
    }
}