package mvc.repositoryJPA;

import mvc.entityJPA.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CategoryRepository extends CrudRepository <CategoryEntity,Integer>{
}
