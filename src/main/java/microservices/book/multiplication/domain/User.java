package microservices.book.multiplication.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
* Stores information to identify the user.
*/

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Entity
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Long id;
	private final String alias;
	
	// Empty constructor for JSON (de)serialization
	
	protected User() {
		alias = null;
	}
}
