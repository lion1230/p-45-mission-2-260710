public class Main {
    public static void main(String[] args){
        int item = 5;
        for(int i = 1; i <= 10; i++){
            if(item > 0){
                item--;
                System.out.println(i + "번 주문 성공, 남은 재고: " + item);
            } else {
                System.out.println(i + "번 주문 실패, 재고 없음");
            }
        }
    }
}
