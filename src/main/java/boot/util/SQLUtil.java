package boot.util;

import boot.domain.City;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.*;

/**
 * Created by xurongyang on 14/11/8.
 */
public class SQLUtil {

    public static Specification<City> getSpecificationQuery(final long id, final String name) {
        return new Specification<City>() {
            @Override
            public Predicate toPredicate(Root<City> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                Predicate p1 = cb.equal(root.get("id").as(Long.class), id);
                if (!StringUtils.isEmpty(name)) {
                    Predicate p2 = cb.equal(root.get("name").as(String.class), name);
                    query.where(cb.and(p1, p2));
                } else {
                    query.where(p1);
                }
                return query.getRestriction();
            }
        };
    }
}
