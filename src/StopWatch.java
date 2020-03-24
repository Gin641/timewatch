import java.util.Date;

public class StopWatch {
    private Date starTime, endTime;
    double start;
    double end;
    Date date = new Date();
    public Date getStarTime(){
        return starTime;
    }
    public Date getEndTime(){
        return endTime;
    }
    public Date startTime(){
        Date time = date;
        return time;
    }
    public void start(){
        this.starTime = starTime;
        this.start = System.currentTimeMillis();
    }
    public void end(){
        this.endTime = endTime;
        this.end = System.currentTimeMillis();
    }
    public double getTime(){
        return (end - start);
    }

    public static void main(String[] args) {
        int[] arr =new int[1000];
        StopWatch stopWatch = new StopWatch();
        try {
            stopWatch.start();
            System.out.print("bắt đầu: "+ stopWatch.getStarTime());
            System.out.println("\ntrước: ");
            for (int value: randomNumber(arr)){
                System.out.println(value+" ");
            }
            System.out.println("\nsau: ");
            for (int value: selectionSort(arr)){
                System.out.print(value+" ");
            }
            stopWatch.end();
            System.out.print("\nEnd: " + stopWatch.getEndTime());
            System.out.println("\nThe amount of time elapsed: " + stopWatch.getTime());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static int[] selectionSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length - 1;i++){
            for (int j = 0;j < arr.length;j++){
                if (arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] randomNumber(int[] arr){
        for (int i =0; i < arr.length;i++){
            arr[i] = (int) (Math.random() * 100000);
        }
        return arr;
    }
}
