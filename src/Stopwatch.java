import java.util.Date;
import java.time.LocalTime;

public class Stopwatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public Stopwatch() {
        startTime = LocalTime.now();
    }

    public LocalTime getStartTime() {
        return this.startTime;
    }

    public LocalTime getEndTime() {
        return this.endTime;
    }

    public void start(){
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }

    public double getElapsedTime() {
        int[] array = new int[100000];
        for (int i=0;i<100000;i++){
            array[i] = (int)Math.floor(Math.random()*10);
        }
        double mil1 = System.currentTimeMillis();
        selectionSort(array);
        double mil2 = System.currentTimeMillis();
        return mil2 - mil1;
    }

    public static void selectionSort(int[] arr){
        int i, j, minIndex;

        for (i = 0; i < arr.length-1; i++)
        {
            minIndex = i;
            for (j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

