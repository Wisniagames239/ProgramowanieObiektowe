package z21;

import java.util.ArrayList;

public class TestClient {
    public static void main(String[] args) {
        ArrayList<Client> clientList = new ArrayList<>();
        clientList.add(new Client("AAA",515.2));
        clientList.add(new Company("A",6532, 14));
        clientList.add(new Client("GGG",615.2));
        clientList.add(new Company("C",1241, 9));
        clientList.add(new Client("BBB",400));
        clientList.add(new Company("B",3421, 14));
        clientList.add(new Client("DDD",351));
        clientList.add(new Company("D",421, 1));
        clientList.add(new Client("CCC",515.2));
        clientList.add(new Company("E",2222, 7));
        clientList.sort(null);
        System.out.println(clientList);
    }
}
