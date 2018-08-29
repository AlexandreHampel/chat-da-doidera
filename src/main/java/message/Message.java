package message;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String msg;

    protected Message() {}

    public Message(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return String.format(
                "MESSAGE[ID=%d, Name='%s', Message='%s']",
                id, name, msg);
    }
	
	public String getName()
	{
		return name;
	}
	public String getMsg()
	{
		return msg;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public void setMsg(String msg)
	{
		this.msg = msg;		
	}
	
	public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}