package Abstract;

public interface BaseService<T> {
	
void add(T entity) throws Exception;

void delete(T entity);

void update(T entity) throws Exception;
}
