package cn.ly.basedao.DAO;

import cn.ly.basedao.pojo.Emp;

import java.util.List;

public interface EmpDAO {
    //查询
    Emp getEmpByEname(String ename);

    Emp getEmpByEmpno(int empno);

    List<Emp> getAllEmp();

    //增删改(逻辑一样,故只实现一种以作参考)
    int updateEmp(int salary,int empno);

}
