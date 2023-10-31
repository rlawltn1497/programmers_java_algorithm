package level1;


public class TEST10 {
    public long solution(int price, int money, int count) {
        long answer = 0; //부족한 금액
        long total_money = 0; //이용료
        for(long i=1; i<=count; i++){
            total_money += (price * i);
        }
        answer = money - total_money;
        if(total_money < money){
            answer= 0;
        }
        else{
            answer=Math.abs(answer);
        }

        return answer;
    }

	public static void main(String[] args) {
		int price = 1000;
		int money = 10000;
		int count = 2;
		
		TEST10 TEST10 = new TEST10();
		long n = TEST10.solution(price,money,count);
		System.out.println(n);
	}
}