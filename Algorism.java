import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Main {
  public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);   //스캐너 객체 생성
        ArrayList<Integer> arr =new ArrayList<>(); //ArrayList로 저장하기 위해 객체 생성
        int n = sc.nextInt(); //입력받기 
        for (int i = 0; i < n; i++) { //n만큼 돌려서 list배열에 추가한다
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);  //정렬
        int count = 0;  //n-arr.get(i) -> 를 카운트 하기 위한 count 변수 생성

        for (int i = arr.size()-1; i > -1; i--) { //정렬되었기 때문에 맨뒤부터 0까지 돔
            if(n==0){break;}      //0이되면 방이 없다는 뜻 break문으로 빠져나옴
            if(n>0) {n-=arr.get(i); count+=1;}    //다뺐을때 0이 안될수도 있기 대문에 
            else {continue;}      //나머진 continue로 다시 for문 반복

        }
        System.out.println(count);  //결과값 count값 출력 
  }
}
