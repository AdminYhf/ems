package com.yhf;

import com.yhf.dao.EmployeeMapper;
import com.yhf.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTest {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private EmployeeService employeeService;

    @Test
    public void test(){
        /*System.out.println(employeeMapper.selectByPrimaryKey(3));
        System.out.println("-------------");
        System.out.println(employeeMapper.selectByPrimaryKey(null));*/
        //System.out.println(employeeService.selectByPrimaryKey(3));
        System.out.println(employeeMapper.getAll());
    }

}
