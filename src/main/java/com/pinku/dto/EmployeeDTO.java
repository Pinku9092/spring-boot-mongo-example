package com.pinku.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;
/*
@Data
@AllArgsConstructor
@NoArgsConstructor
*/
public class EmployeeDTO {


    private String empName;
    private String location;
    private BigDecimal salary;
    public EmployeeDTO() {
    	
    }
	public EmployeeDTO(String empName, String location, BigDecimal salary) {
		super();
		this.empName = empName;
		this.location = location;
		this.salary = salary;
	}

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
	@Override
	public int hashCode() {
		return Objects.hash(empName, location, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDTO other = (EmployeeDTO) obj;
		return Objects.equals(empName, other.empName) && Objects.equals(location, other.location)
				&& Objects.equals(salary, other.salary);
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empName=" + empName + ", location=" + location + ", salary=" + salary + "]";
	}
    
    
}
