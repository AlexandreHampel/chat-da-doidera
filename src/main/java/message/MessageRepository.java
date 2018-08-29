package message;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface MessageRepository extends Repository<Message, Long>{
   //@Query("SELECT message FROM Message message")
	public List<Message> findAll();
    public void save(Message message);	
}

