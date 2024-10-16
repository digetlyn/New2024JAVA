package construct;

public class MemberThis  {

    String nameField;

    void  initMember(String nameParameter) {
        nameField = nameParameter;  //this가 생략이 되어 있다.
    }
}
