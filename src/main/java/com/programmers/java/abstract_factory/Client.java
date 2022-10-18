package com.programmers.java.abstract_factory;

// 해당 패턴을 사용하는 이유
// : 구체적으로 특정 상황이 정해지지 않은 경우에 상황에 따라서 특정 상황에 맞는 여러 개의
//   객체들을 똑같은 상황으로 생성하기 위해서 이를 이용.
//   DI를 이용하기에 의존성이 낮고 DIP를 이용해서 구현 코드 부분은 손대지 않고
//   호출 코드 부분만을 수정해서 바꿀 수 있음.

public class Client {
    private Factory factory;
    private Sofa sofa;
    private Table table;
    private Chair chair;

    public void initialize() {
        String getBrand = "MODERN";
        Factory factory;
        if (getBrand.equals("MODERN")) {
            factory = new ModernFactory();
        } else {
            factory = new VictoriaFactory();
        }

        sofa = factory.createSofa();
        table = factory.createTable();
        chair = factory.createChair();
    }

    public void run() {
        sofa.info();
        table.info();
        chair.info();
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.initialize();
        client.run();
    }
}
