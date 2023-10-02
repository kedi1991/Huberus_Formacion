package microservices.book.multiplication.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
/**
* Identifies the attempt from a {@link User} to solve a
* {@link Multiplication}.
*/
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Entity
public final class MultiplicationResultAttempt {
	
	@Id
	@GeneratedValue
	private Long Id;
	
	private final User user;
	private final Multiplication multiplication;
	private final int resultAttempt;
	private final boolean correct;

	// Empty constructor for JSON (de)serialization
	MultiplicationResultAttempt() {
		user = null;
		multiplication = null;
		resultAttempt = -1;
		correct = false;
	}

}
