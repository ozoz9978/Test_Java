package objectInherit;

import java.util.Objects;

class Friend {
    String name;
    int age;
   
    public Friend(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
   
    public void output() {
        System.out.println(name + ", " + age + "살");
    }

    // 멤버 변수를 문자열로 변환하여 반환해주는 메소드
    @Override
    public String toString() {
        return "Friend [name=" + name + ", age=" + age + "]";
    }
//    
//    @Override
//	public int hashCode() {
//		return Objects.hash(age, name);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Friend other = (Friend) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
}

public class FriendTest {

    public static void main(String[] args) {
        Friend f1 = new Friend("손오공", 34);
        f1.output();
      
        // 전달 인자가 객체면 그 객체의 오버라이드된 toString()을 호출한다. 
        // 오버라이드 되어 있지 않으면 Object로부터 상속받은 순수 toString() 호출
        System.out.println(f1); // 주소 출력
        Friend f2 = new Friend("저팔계", 25);
        System.out.println(f2);
      
        Friend f3 = new Friend("손오공", 34);
        Friend f4 = null;
      
        // 주소를 비교하는 것이므로 둘다 false
        System.out.println(f1 == f2); // false
        System.out.println(f1 == f3); // false
      
        // 내용을 비교해서 같은 데이터라고 true를 출력하려면 
        // 오버라이딩 해야함
        System.out.println(f1.equals(f3)); // true
        System.out.println(f1.equals(f4));
        
        System.out.println();
        
        String addr = "서울시";
        System.out.println(addr.getClass()); // getclass 타입을 알려줌
        System.out.println(f1.getClass());
        
        
        
    }
}
