import com.example.dao.UserDao;
import com.example.dao.UserGroupDao;
import com.example.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;


/**
 * Created by Razor on 7/10/2015.
 */
@ContextConfiguration(locations = {"/context.xml"})
public class JpaTestCase extends AbstractTestNGSpringContextTests {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserGroupDao userGroupDao;

    @Test
    public void createGroupWithUsers(){
        PowerUser powerUser = new PowerUser("POWER GUY","POWER CUCUMBER");
        SuperUser superUser = new SuperUser("SUPER MAN", "SUPER TOFFEE");
        superUser.setAvatar(new Avatar("$"));
        superUser.setUserInfo(new UserInfo("super man's secret file"));
        UserGroup justiceLeague = new UserGroup("JUSTICE LEAGUE");
        justiceLeague.getUsers().add(powerUser);
        justiceLeague.getUsers().add(superUser);
        userGroupDao.create(justiceLeague);
    }
}
