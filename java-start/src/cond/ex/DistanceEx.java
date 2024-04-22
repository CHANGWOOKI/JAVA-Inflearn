package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int distandce = 25;

        if (distandce <= 1) {
            System.out.println("도보를 이용하세요");
        } else if (distandce <= 10) {
            System.out.println("자전거를 이용하세요");
        } else if (distandce <= 100) {
            System.out.println("자동차를 이용하세요");
        } else {
            System.out.println("비행기를 이용하세요");
        }
    }
}
