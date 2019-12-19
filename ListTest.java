package day13;

import java.util.*;
class CreateList{

		public ArrayList<Integer> convertList(int array[]){
			
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			for(int i=array.length-1;i>=0;i--) {
				list1.add(array[i]);
			}
			return list1;
		}


}

//배열을 생성하여 CreateList의 convertList()
public class ListTest {
	public static void main(String[] args) {
		//를 호출한 다음 리턴된 ArrayList<integer>객체의
		//데이터들을 행 단위로 출력한다
		int arr[] = {3,4,2,5,2,3,6,7,5,7,9};
		ArrayList<Integer> alist = new CreateList().convertList(arr);

		Iterator<Integer> it = alist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
