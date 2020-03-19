package tw.com.thinkpower.demo2.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import tw.com.thinkpower.demo2.model.User;


public interface RoleRepository extends CrudRepository<User, Long>{
//	Optional<Device> findByIdAndTenantIdAndStatusNot(String id, String tenantId, ModelStatus status);
//	List<Device> findByUnitIdAndTenantIdAndStatusNot(String unitId, String tenantId, ModelStatus status);
}
