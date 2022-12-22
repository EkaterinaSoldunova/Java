public class Tester_RandomTask2 {
    int k;
    Circle[] arr;
    Tester_RandomTask2(int k, Circle[] a){
        this.k=k;
        arr = new Circle[k];
        for (int i=0;i<k;i++){
            arr[i]=a[i];
        }
    }
    public Circle minCircle(){
        Circle minC = arr[0];
        for(int i=1; i<k; i++){
            if (arr[i].radius<minC.radius) minC=arr[i];
        }
        return minC;
    }
    public Circle maxCircle(){
        Circle maxC = arr[0];
        for(int i=1; i<k; i++){
            if (arr[i].radius>maxC.radius) maxC=arr[i];
        }
        return maxC;
    }
    public void sortArr(){
        for (int left = 0; left < k; left++) {
            Circle value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.radius < arr[i].radius) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
        }
    }
    public String toString(){
        String ans="";
        for(Circle a : arr) {
            ans=ans+a+"\n";
        }
        return ans;
    }
    public static void main(String[] args){
        Circle[] arr = new Circle[4];
        arr[0]= new Circle(0,0);
        arr[1]= new Circle(1,1);
        arr[2]= new Circle(2,3);
        arr[3]= new Circle(4,5);
        Tester_RandomTask2 t = new Tester_RandomTask2(4, arr);
        System.out.println("Самая маленькая окружность: "+t.minCircle());
        System.out.println("Самая большая окружность: "+t.maxCircle());
        System.out.println("Отсортированный массив окружностей:");
        t.sortArr();
        System.out.println(t);
    }
}
