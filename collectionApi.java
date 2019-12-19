/* collection 데이터를 보관하는 방을 의미하는 api라고 이해ㄱ
* -저장할 수 있는 데이터의 타입에 제한이 없다.  
 * -저장할 수 있는 데이터의 갯수에 제한이 없다. 배열과의 차이점!!
 * 
 * List 
 * 순서가 있는 데이터의 집합, 데이터의 중복을 허락한다. (ex. 대기자 명단)
 * 저장되는 데이터의 순서를 유지한다. 
 * 누가 먼저왔는지 구분이 가능해야함
 * 저장되는 데이터의 중복을 허용한다. 
 * ArrayList, LinkedList, Vector
 * -------------------------------------------------------------
 * 
 * Set
 * 저장되는 데이터의 순서를 유지하지 않는다.
 * 저장되는 데이터의 중복을 허용하지 않는다. 
 * 로또할 때 처럼 중복체크해주는 기능을 따로 내가 구현안해도 됨(ex 이벤트 응모, 양의 소수집합, 소수의 집합)
 * equals, hashcode 함수를 동시에 호출한다. (동일한 개체 유무를 파악하기 위해)
 * 참조변수값에 포함된 값에 대한 유무를 파악하기 위해 hashset 자동지원
 * Hashset, TreeSet
 * ------------------------------------------------------------- 
 *
 * Map
 * 데이터 이름과 데이터 값을 쌍으로 저장한다.
 * 키(key)와 값(value)의 쌍(value)으로 이뤄진 데이터의 집합
 * 순서는 유지되지 않으며, 키는 중복허용 xxx, 값은 중복허용ooo
 * Hashmap, Hashtable
 * --------------------------------------------------------------
 *
 * 자료구조(stack, queue,set)
 * stack(push : 데이터 삽입, pop : 데이터 호출)
 * 마지막에 저장한 데이터를 가장 먼저 꺼내는 LIFO구조로 돼있음
 * 
 * 
 * queue(LinkedList 클래스로 사용할 수 있윰)
 * 처음에 저장한 데이터를 가장 먼저 꺼내는 FIFO구조
 * 해쉬알고리즘을 사용한다. 폰에 저장된 번호가 많다. 데이터에 저장된 정보를 분리하는 것
 * 이름에 해쉬가 들어가면 해쉬알고리즘을 이용한다.
 * offer : 큐에 데이터 저장
 * poll : 큐에 데이터 호출
 * peek : 큐에 있던 데이터를 꺼내기만 하고 데이터는 그대로 큐에 남아있는 명령
 * 
 * 
 * set
 * 중복되는 데이터를 허용하지 않음
 * String
 * 
 * 
 * 
 * collections 클래스 : Collection API들을 도와주는 도우미 클래스
 * -----------arrayList클래스------------------
 * list.add 데이터 삽입
 * list.set 데이터 교체
 * list.remove 데이터 제거
 * list.indexof 데이터검색
 * 
 * -----------LinkedList클래스------------------
 * LinkedList클래스의 검색에 대한 개선된 방안이 for-each or iterator(LinkedList는 검색이 별로임)
 * list.add 데이터 삽입(양방향으로)    LinkedList의 배열크기는 다 4바이트
 * 			arraylist는 삽입할때 모두다 한칸씩 이동이였는데 LinkedList는 
 * 			노드연결을 끊고 중간에 삽입하면 된다.  
 *  
 *  
 *  전체를 꺼내올때는 for-each or iterator
 *  삽입 혹은 삭제는 LinkedList를 사용한다.
 *  hasNext는 다음에 올 데이터 값이 더 있는지 확인하는 것
 * 
 * list.addLast : 데이터를 스택의 마지막에 삽입
 * list.getLast : 데이터를 스택의 마지막에 호출
 * 
 * 
 * Hashset은 for-each 와 iterator로만 사용가능 하다 
 * 
 * ----------------------hash table-----------------------
 * 해쉬 테이블(hash table)
 * 여러 개의 통을 만들어 두고 키 값을 이용하여 데이터를 넣을 통 번호를 계산하는 자료구조
 * 해쉬 테이블로 사용할 수 있는 클래스 : hashmap클래스 
 * 
 * 해쉬 테이블 생성 방법
 * HashMap은 Hashset과 달리 중복된것이 있으면 고쳐서 넣는다. 
 * hashtable.put("해리",new Integer(95));
 *               키값               데이터
 * 항상 hashtable은 키값과 데이터 두개가 있어야 한다. 
 * 
 * */


package day13;
public class collectionApi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
