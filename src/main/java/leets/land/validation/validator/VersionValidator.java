package leets.land.validation.validator;

import leets.land.validation.constraint.Constraint;
import leets.land.validation.constraint.InvalidVersionConstraint;
import leets.land.validation.exception.InvalidInputException;

import java.util.List;

public class VersionValidator {

    private final List<Constraint<String>> constraints = List.of(new InvalidVersionConstraint());  // 다른 제약 조건이 생기면 추가

    public void validate(Object value) throws InvalidInputException {
        for (Constraint<String> constraint : constraints) {
            constraint.isValid(value.toString());
        }
    }
}
