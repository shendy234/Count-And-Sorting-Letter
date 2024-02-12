import java.util.List;

public class Main {
    public static void main(String[] args) {
        NomerSatu nomerSatu= new NomerSatu();
        NomerDua nomerDua = new NomerDua();

        String resultA = nomerSatu.countLetter("We Always Mekar").toString();
        System.out.println(resultA);
        String resultB = nomerSatu.countLetter("coding is fun").toString();
        System.out.println(resultB);
        String[] inputArray= {"Pendanaan", "Terproteksi", "Untuk", "Dampak", "Berarti"};
        System.out.println(nomerDua.processInput(inputArray));
    }
}