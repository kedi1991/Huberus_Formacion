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
* This represents a Multiplication (a * b). We are now using lombok annotations
*/
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Entity
public final class Multiplication {

	@Id
	@GeneratedValue
	@Column(name = "MULTIPLICATION_ID")
	private Long id;
	// Both factors
	private final int factorA;
	private final int factorB;

	// Empty constructor for JSON (de)serialization
	Multiplication() {
		this(0, 0);
	}
}