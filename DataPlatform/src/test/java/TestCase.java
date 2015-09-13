import org.junit.Test;
import org.junit.runner.RunWith;
import org.q.data.RedisClientTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestCase extends AbstractJUnit4SpringContextTests {

	@Autowired
	RedisClientTemplate redisClient;

	@Test
	public void PostTestPay(){
		System.out.println(redisClient.get("name"));
	}
	
}
