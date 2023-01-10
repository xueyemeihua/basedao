package cn.ly.basedao.test;

import cn.ly.basedao.impl.EmpDAOImpl;
import cn.ly.basedao.pojo.Emp;
import org.junit.Test;

import java.util.List;

public class BaseDaoTest {

    EmpDAOImpl dao = new EmpDAOImpl();

    @Test
    public void testGetEmpByEname() {
        System.out.println(dao.getEmpByEname("lily"));
    }

    @Test
    public void testGetAllEmp() {
        List<Emp> emps = dao.getAllEmp();
        emps.forEach(emp -> System.out.println(emp));
    }

    @Test
    public void testUpdateEmp() {
        System.out.println(dao.updateEmp(13000,3));
        System.out.println(dao.getEmpByEmpno(3).getSalary());
    }


}
