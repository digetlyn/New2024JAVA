package construct;

public class MemberInit {

    String name;
    int age;
    int grade;



    //추가 this 인스턴스 갖고 온다
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
