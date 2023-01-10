package cn.ly.basedao.impl;

import cn.ly.basedao.DAO.BaseDao;
import cn.ly.basedao.DAO.EmpDAO;
import cn.ly.basedao.pojo.Emp;

import java.util.List;

public class EmpDAOImpl extends BaseDao<Emp> implements EmpDAO {
    @Override
    public Emp getEmpByEname(String ename) {
        return super.getOne("select * from emp where ename=?",ename);
    }

    @Override
    public Emp getEmpByEmpno(int empno) {
        return super.getOne("select * from emp where empno=?",empno);
    }


    @Override
    public List<Emp> getAllEmp() {
        return super.getAll("select * from emp");
    }

    @Override
    public int updateEmp(int salary,int empno) {
        return super.executeUpdate("update emp set salary=? where empno=?",salary,empno);
    }
}
