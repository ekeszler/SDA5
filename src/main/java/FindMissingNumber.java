public class FindMissingNumber {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 8};
        FindMissingNumber finder = new FindMissingNumber();
        finder.findMissingOne(numbers);
    }

    public Integer findMissingOne(int[] numbers){
        int counter = 1;
        int i = 0;
            for(Integer number:numbers){
                if(counter == numbers[i]){
                        counter = counter + 1;
                        i++;
                }else{
                    System.out.println("numarul "+ counter + " lipseste");
                }
            }
            return counter;

    }
}
