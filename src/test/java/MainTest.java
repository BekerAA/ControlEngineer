import org.Andrey.Bec.Model.NoEntity.Role;
import org.Andrey.Bec.Model.User;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void createUserBulder(){
        try {
            User userTest = User.builder().name("Andrey").lastName("Pushkov").email("a.pushkov@vodokomfort.ru").role(Role.ADMIN).build();
            System.out.println("Пользователь создан " + userTest.toString() );
        } catch (Exception e){
            System.out.println("Неправильная создание пользователя");
        }
    }

}
