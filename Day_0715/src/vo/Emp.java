package vo;

import java.util.Objects;

public class Emp {
	private int empno; // 사원번호
	private String name; // 직원명
	private int salary; // 월급
	private String depart; // 부서명
	public Emp() {
		super();
	}
	
	public Emp(int empno, String name, int salary, String depart) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(depart, empno, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(depart, other.depart) && empno == other.empno && Objects.equals(name, other.name)
				&& salary == other.salary;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", salary=" + salary + ", depart=" + depart + "]";
	}
	
}

