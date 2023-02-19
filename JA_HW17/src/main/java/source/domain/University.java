package source.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String name;

	@Column
	private int accreditationLevel;

	@Column
	private int institutes;

	@Column
	private int students;

	@Column
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccreditationLevel() {
		return accreditationLevel;
	}

	public void setAccreditationLevel(int accreditationLevel) {
		this.accreditationLevel = accreditationLevel;
	}

	public int getInstitutes() {
		return institutes;
	}

	public void setInstitutes(int institutes) {
		this.institutes = institutes;
	}

	public int getStudents() {
		return students;
	}

	public void setStudents(int students) {
		this.students = students;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", accreditationLevel=" + accreditationLevel
				+ ", institutes=" + institutes + ", students=" + students + ", address=" + address + "]";
	}

}
