import com.github.javafaker.Faker;

public class First {
public static void main(String[] args){
    System.out.println(Faker.instance().address().fullAddress());
}
}
