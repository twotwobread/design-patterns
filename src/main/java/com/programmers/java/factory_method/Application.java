package com.programmers.java.factory_method;

// 필요한 이유 : 객체 생성을 위한 패턴
// 만약 Truck truck = new Truck(); 과 같은 형태로 만들었다면
// Ship을 추가한다고 생각하면 객체 하나를 더 만들고 if로 나누고 코드 구현부분을 수정해야함.
// 하지만 팩토리 메서드를 만들어주면 객체를 하나 더 만들 필요도 없고 코드 구현 부분은 두고
// 코드 호출 부분, 그리고 Ship관한 부분만 추가 하면된다.

public class Application {
    private Logistics logistics;
    private Transport transport;

    private void initialize() {
        logistics = new SeaLogistics();
        logistics.run();
    }

    public static void main(String[] args) {
        new Application().initialize();
    }
}
