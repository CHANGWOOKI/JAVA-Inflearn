package static1;


public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data2 = new Data2("김창욱", counter);
        System.out.println(counter.count);

        Data2 data3 = new Data2("김창욱", counter);
        System.out.println(counter.count);

        Data2 data4 = new Data2("김창욱", counter);
        System.out.println(counter.count);

        Data2 data5 = new Data2("김창욱", counter);
        System.out.println(counter.count);


    }
}
