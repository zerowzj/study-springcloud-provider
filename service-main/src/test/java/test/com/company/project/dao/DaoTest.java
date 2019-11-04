package test.com.company.project.dao;

import com.company.project.support.SpringBootCfg;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootCfg.class)
public class DaoTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void test() {
        System.out.println(dataSource.getClass().getName());
    }
}