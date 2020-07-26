package com.Springboot.EAMS.repo;

import com.Springboot.EAMS.model.entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailsRepo extends JpaRepository<EmployeeDetails, Long> {
/*@Transactional
    @Modifying
    @Query("update EmployeeDetails e set e.salary=e.salary+ :inc")
    public void updatesalary(@Param("inc") long inc);

    @Query(value = "update employeedetails set salary = salary+:inc where \n" +
            "employee_id in (\n" +
            "select id from employee where department_id= :departmentId);",nativeQuery = true)
    public void updatebyemployeedepatment(@Param("inc") long inc,@Param("departmentId") long departmentId);
*/

}