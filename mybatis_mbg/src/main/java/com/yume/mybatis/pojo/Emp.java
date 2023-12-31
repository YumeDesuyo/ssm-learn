package com.yume.mybatis.pojo;

public class Emp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.emp_id
     *
     * @mbggenerated Mon Nov 21 21:45:17 CST 2022
     */
    private Integer empId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.emp_name
     *
     * @mbggenerated Mon Nov 21 21:45:17 CST 2022
     */
    private String empName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.emp_age
     *
     * @mbggenerated Mon Nov 21 21:45:17 CST 2022
     */
    private Integer empAge;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.emp_gender
     *
     * @mbggenerated Mon Nov 21 21:45:17 CST 2022
     */
    private String empGender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.dept_id
     *
     * @mbggenerated Mon Nov 21 21:45:17 CST 2022
     */
    private Integer deptId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.emp_id
     *
     * @return the value of t_emp.emp_id
     *
     * @mbggenerated Mon Nov 21 21:45:17 CST 2022
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.emp_id
     *
     * @param empId the value for t_emp.emp_id
     *
     * @mbggenerated Mon Nov 21 21:45:17 CST 2022
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.emp_name
     *
     * @return the value of t_emp.emp_name
     *
     * @mbggenerated Mon Nov 21 21:45:17 CST 2022
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.emp_name
     *
     * @param empName the value for t_emp.emp_name
     *
     * @mbggenerated Mon Nov 21 21:45:17 CST 2022
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.emp_age
     *
     * @return the value of t_emp.emp_age
     *
     * @mbggenerated Mon Nov 21 21:45:17 CST 2022
     */
    public Integer getEmpAge() {
        return empAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.emp_age
     *
     * @param empAge the value for t_emp.emp_age
     *
     * @mbggenerated Mon Nov 21 21:45:17 CST 2022
     */
    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.emp_gender
     *
     * @return the value of t_emp.emp_gender
     *
     * @mbggenerated Mon Nov 21 21:45:17 CST 2022
     */
    public String getEmpGender() {
        return empGender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.emp_gender
     *
     * @param empGender the value for t_emp.emp_gender
     *
     * @mbggenerated Mon Nov 21 21:45:17 CST 2022
     */
    public void setEmpGender(String empGender) {
        this.empGender = empGender == null ? null : empGender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.dept_id
     *
     * @return the value of t_emp.dept_id
     *
     * @mbggenerated Mon Nov 21 21:45:17 CST 2022
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.dept_id
     *
     * @param deptId the value for t_emp.dept_id
     *
     * @mbggenerated Mon Nov 21 21:45:17 CST 2022
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empGender='" + empGender + '\'' +
                ", deptId=" + deptId +
                '}';
    }

    public Emp() {
    }

    public Emp(Integer empId, String empName, Integer empAge, String empGender, Integer deptId) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empGender = empGender;
        this.deptId = deptId;
    }
}