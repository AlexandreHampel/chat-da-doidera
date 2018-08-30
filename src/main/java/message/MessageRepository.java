package message;


import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long>{
    public Iterable<Message> findAllByOrderByIdDesc();
}

