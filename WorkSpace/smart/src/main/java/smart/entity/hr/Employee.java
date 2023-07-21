package smart.entity.hr;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity(name="employees")
public class Employee {
	@Id @Column(name="employee_id") private Integer employeeid;
	private String last_name, first_name;

}
