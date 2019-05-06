package woodspring.springmill.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "KronosDump")
public class KronosDump  extends BaseModel {
	
	@Indexed
	private Integer ckdId;

	//@TextIndexed
	//@Id
	//private String uuid;
	
	//@Indexed
	private Integer ckId;
	
	//@TextIndexed
	private String firstName;
	
	//@TextIndexed
	private String lastName;
	
	//@TextIndexed
	private String telphone;

	private String h_Comp;
	
	private String h_VP;
	
	private String h_Site;
	
	private String h_Prog;
	
	private String h_Dep;
	
	private String h_Subdep;
	
	private String h_Title;

	private String p_CVP;
	
	private String p_Site;
	
	private String p_Prog;
	
	private String p_Dep;
	
	private String p_Subdep;
	
	
	private String p_Title;
	
	private String p_Union;
	
	private String email;

	private String repoerTo;
	
	private String manager;

	private String site;

	private String status;
	
	private String orgLev6;
	
	private String orgLev7;
	
	private String labLev5;
	
	private String labLev7;
	
	private Date createAt;



}
