package smart.repository.hanul;

import org.springframework.data.jpa.repository.JpaRepository;

import smart.entity.hanul.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
