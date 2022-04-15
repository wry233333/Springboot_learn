package com.wry333.springboot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wry333.springboot.dao.UserDao;
import com.wry333.springboot.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {
        userDao.selectById(1);
        System.out.println(userDao);
    }

    @Test
    void save(){
        User user = new User();
        user.setName("liangliangche");
        user.setPassword("llc");
        userDao.insert(user);
    }

    @Test
    void page_test(){
        IPage<User> iPage =new Page<User>(1,5);
        userDao.selectPage(iPage,null);
    }

    @Test
    void testGetBy(){
        QueryWrapper<User> wrapper =new QueryWrapper<User>();
        wrapper.like("name","zhangsan");
        userDao.selectList(wrapper);
    }

    @Test
    void testDelete(){
        userDao.deleteById(2);
        System.out.println("success...");
    }

}
