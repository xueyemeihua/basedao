package cn.ly.basedao.pojo;

import java.sql.Date;

public class Emp {
    private Integer empno;
    private String ename;
    private String job;
    private Integer salary;
    private Integer mgr;
    private Integer bonus;
    private Date hiredate;
    private Integer deptno;

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", mgr=" + mgr +
                ", bonus=" + bonus +
                ", hiredate='" + hiredate + '\'' +
                ", deptno=" + deptno +
                '}';
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public Emp(Integer empno, String ename, String job, Integer salary, Integer mgr, Integer bonus, Date hiredate, Integer deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.salary = salary;
        this.mgr = mgr;
        this.bonus = bonus;
        this.hiredate = hiredate;
        this.deptno = deptno;
    }
}
