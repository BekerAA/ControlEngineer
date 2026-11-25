import org.Andrey.Bec.Config.BecConfig;
import org.Andrey.Bec.Dao.UserDao;
import org.Andrey.Bec.Dao.UserDaoImpl;
import org.Andrey.Bec.Model.NoEntity.Role;
import org.Andrey.Bec.Model.User;
import org.Andrey.Bec.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainTest {

    ApplicationContext applicationContext  =  new AnnotationConfigApplicationContext(BecConfig.class);
    UserService userService  = applicationContext.getBean(UserService.class);

    @Test
    public void createUserBulder(){
        try {
            User userTest = User.builder().name("Andrey").lastName("Pushkov").email("a.pushkov@vodokomfort.ru").role(Role.ADMIN).build();
            System.out.println("Пользователь создан " + userTest.toString() );
        } catch (Exception e){
            System.out.println("Неправильная создание пользователя");
        }
    }

    @Test
    public void saveUser(){
        User userTest = User.builder().name("Andrey").lastName("Mashinin").email("a.pushkov@vodokomfort.ru").role(Role.ADMIN).build();
        userService.save(userTest);
        System.out.println("Пользователь сохранен: ОК!");
    }

    @Test
    public void updateUser(){
        User userTest = User.builder().name("Andrey").lastName("Mashinin").email("a.pushkov@vodokomfort.ru").role(Role.ADMIN).build();
        userService.update(4L, userTest);
        System.out.println("Пользователь сохранен: ОК!");
    }

    @Test
    public void deleteUser(){
        userService.delete(5L);
        System.out.println("Пользователь удален: ОК!");
    }

    @Test
    public void getAllUsers(){
        List<User> userList = userService.findAll();
        for (int i = 0; i < userList.size() ; i++) {
            User user = userList.get(i);
            System.out.println(user.toString());
        }

    }
}
