package microservices.book.multiplication.service;

import org.hamcrest.Matcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;

@Service
public class MultiplicationServiceImpl implements MultiplicationService{

	private RandomGeneratorService randomGeneratorService;

	@Autowired
	public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
		this.randomGeneratorService = randomGeneratorService;
	}
	@Override
	public Multiplication createRandomMultiplication() {
		// TODO Auto-generated method stub
		int factorA = randomGeneratorService.generateRandomFactor();
		int factorB = randomGeneratorService.generateRandomFactor();
		return new Multiplication(factorA, factorB);
	}
	@Override
	public boolean checkAttempt(MultiplicationResultAttempt resultAttempt) {
		// TODO Auto-generated method stub
		return resultAttempt.getResultAttempt() == resultAttempt.getMultiplication().getFactorA() * resultAttempt.getMultiplication().getFactorB();
	}
	@Override
	public Object checkAttempt(Matcher<MultiplicationResultAttempt> any) {
		// TODO Auto-generated method stub
		return null;
	}

}
